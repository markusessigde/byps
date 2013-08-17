﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;

namespace com.wilutions.byps
{
    public class HServerR : BServerR
    {
        public HServerR(BTransport transport, BServer server, int nbOfConns)
            : base(transport, server)
        {
            this.nbOfConns = nbOfConns;
            this.sleepMillisBeforeRetry = 60 * 1000;
            //workerThread = new Thread(new ParameterizedThreadStart(workerFnct));
        }

        public override void start()
        {
            if (log.isDebugEnabled()) log.debug("start(");
            for (int i = 0; i < Math.Max(1, nbOfConns); i++)
            {
                sendLongPoll(null);
            }
            //workerThread.Start(this);
            //sendLongPollInWorkerThread(null);
            if (log.isDebugEnabled()) log.debug(")start");
        }

        public override void done()
        {
            if (log.isDebugEnabled()) log.debug("done(");
            lock (mutex)
            {
                isDone = true;
                Monitor.PulseAll(mutex);
            }
            //workerThread.Interrupt();
            //this.transport.wire.cancelAllRequests();
            //try
            //{
            //    workerThread.Join(1000);
            //}
            //catch (Exception) { }
            if (log.isDebugEnabled()) log.debug(")done");
        }

        protected class MyAsyncResult : BAsyncResult<BMessage>
        {
            private HServerR pthis;

	        public MyAsyncResult(HServerR pthis)
            {
                this.pthis = pthis;
            }

            public void setAsyncResult(BMessage obj, Exception ex)
            {
				try {
                    if (ex != null)
                    {
                        BOutput bout = pthis.transport.getOutput();
                        bout.header.flags = BMessageHeader.FLAG_RESPONSE;
                        bout.setException(ex);
                        BMessage msg = bout.toMessage();
                        pthis.sendLongPoll(msg);
                    }
                    else {
					    pthis.sendLongPoll(obj);
                    }
				} catch (BException) {
				}
			}
				
		}

        protected class MyAsyncMethod : BAsyncResult<BMessage>
        {
            protected HServerR pthis;
            protected MyAsyncResult asyncResult;

            public MyAsyncMethod(HServerR pthis, MyAsyncResult asyncResult)
            {
                this.pthis = pthis;
                this.asyncResult = asyncResult;
            }

            public void setAsyncResult(BMessage obj, Exception ex)
            {
				try {
                    if (ex != null || obj.isEmpty())
                    {
                        bool isTimeout = ex != null && ex.ToString().IndexOf("408") >= 0;
                        if (isTimeout || pthis.checkDoneMaybeWait())
                        {
                            pthis.sendLongPoll(null);
                        }
                    }
                    else if (obj.buf != null && obj.buf.remaining() != 0)
                    {
						// Methode ausführen
                        pthis.transport.recv(pthis.server, obj, asyncResult);
					}
				} catch (Exception e) {
                    asyncResult.setAsyncResult(null, e);
				}
			}
				
		};


        protected class LongPoll {

            private readonly Log log = LogFactory.getLog(typeof(LongPoll));
            protected BMessage methodResult;
            protected HServerR pthis;

            public LongPoll(HServerR pthis, BMessage methodResult)
            {
                if (log.isDebugEnabled()) log.debug("LongPoll(" + methodResult);
                this.pthis = pthis;
			    if (methodResult != null) {
				    this.methodResult = methodResult;
			    }
			    else {
				    BOutput outp = pthis.transport.getOutput();
				    outp.header.flags |= BMessageHeader.FLAG_RESPONSE;
				    outp.store(null); // irgendwas, damit auch der Header in den ByteBuffer geschrieben wird.
				    this.methodResult = outp.toMessage();
			    }
                if (log.isDebugEnabled()) log.debug(")LongPoll");
		    }
		
		    public void run() {
                if (log.isDebugEnabled()) log.debug("run(");

                MyAsyncResult asyncResult = new MyAsyncResult(pthis);

                BAsyncResult<BMessage> nextAsyncMethod = new MyAsyncMethod(pthis, asyncResult);
	
			    // Sende den longPoll-Request
			    // Im Body befindet sich die Antwort auf die vorige vom Server gestellte Anfrage.
			    // Als Ergebnis des longPoll kommt eine neue Serveranfrage (Methode).

                pthis.transport.wire.sendR(methodResult, nextAsyncMethod);

                if (log.isDebugEnabled()) log.debug(")run");
		    }
	
    	} // class LongPoll

        protected void sendLongPoll(BMessage obj) 
        {
            if (log.isDebugEnabled()) log.debug("sendLongPollInWorkerThread(" + obj);
            lock (mutex)
            {
                if (!isDone)
                {
                    LongPoll lp = new LongPoll(this, obj);
                    lp.run();
                }
            }
            //lock(this) 
            //{
            //    currentLongPoll_access_sync = lp;
            //    Monitor.PulseAll(this);
            //}
            if (log.isDebugEnabled()) log.debug(")sendLongPollInWorkerThread");
	    }

        //protected static void workerFnct(object thisObj)
        //{
        //    Log log = LogFactory.getLog(typeof(HServerR));
        //    if (log.isDebugEnabled()) log.debug("workerFnct(");
        //    HServerR pthis = (HServerR)thisObj;
   
        //    while (!pthis.interrupted)
        //    {
        //        try
        //        {
        //            LongPoll lp = null;

        //            lock(pthis) 
        //            {
        //                while (pthis.currentLongPoll_access_sync == null) 
        //                {
        //                    if (log.isDebugEnabled()) log.debug("wait for LongPoll");
        //                    Monitor.Wait(pthis);
        //                }
        //                lp = pthis.currentLongPoll_access_sync;
        //                pthis.currentLongPoll_access_sync = null;
        //            }

        //            if (log.isDebugEnabled()) log.debug("execute LongPoll");
        //            lp.run();
        //        }
        //        catch (ThreadInterruptedException e)
        //        {
        //            if (log.isDebugEnabled()) log.debug("Recevied " + e);
        //            break;
        //        }
        //        catch (ThreadAbortException e)
        //        {
        //            if (log.isDebugEnabled()) log.debug("Recevied " + e);
        //            break;
        //        }
        //        catch (Exception e)
        //        {
        //            log.error("LongPoll worker thread received uncaught exception.", e);
        //        }
        //    }
        //    if (log.isDebugEnabled()) log.debug("Worker interrupted");

        //    if (log.isDebugEnabled()) log.debug(")workerFnct");
        //}

        protected bool checkDoneMaybeWait()
        {
 	        lock(mutex)
            {
                if (!isDone)
                {
                    Monitor.Wait(mutex, sleepMillisBeforeRetry);
                }
                return isDone;
            }
        }
    

        //protected String name = "ServerR";
        //protected Thread workerThread;
        //protected LongPoll currentLongPoll_access_sync;
        //protected volatile bool interrupted;
        protected readonly int nbOfConns;
        protected bool isDone;
        protected int sleepMillisBeforeRetry;
        protected object mutex = new object();
        private readonly Log log = LogFactory.getLog(typeof(HServerR));
     }
}
