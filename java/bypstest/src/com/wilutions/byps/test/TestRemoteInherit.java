package com.wilutions.byps.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wilutions.byps.RemoteException;
import com.wilutions.byps.test.api.BClient_Testser;
import com.wilutions.byps.test.api.enu.EnumPlanets;
import com.wilutions.byps.test.api.inherit.BioLemonServiceAsync;
import com.wilutions.byps.test.api.remote.RemoteEnums;

public class TestRemoteInherit {
  
  BClient_Testser client;
  private Log log = LogFactory.getLog(TestRemoteInherit.class);

  @Before
  public void setUp() throws RemoteException {
    client = TestUtilsHttp.createClient();
  }
  
  @After
  public void tearDown() {
    if (client != null) {
      client.done();
    }
  }
  
  @Test
  public void testRemoteBioLemonService() throws RemoteException {
    log.info("testRemoteBioLemonService(");
    

    
    log.info(")testRemoteBioLemonService");
  }

}
