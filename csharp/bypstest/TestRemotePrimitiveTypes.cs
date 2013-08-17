﻿using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using com.wilutions.byps;
using com.wilutions.byps.test.api;
using com.wilutions.byps.test.api.remote;
using com.wilutions.byps.test.api.prim;
using com.wilutions.byps.test.api.srvr;
using System.IO;

namespace bypstest
{
    [TestClass]
    public class TestRemotePrimitiveTypes
    {
        Log log = LogFactory.getLog(typeof(TestRemotePrimitiveTypes));
        BClient_Testser client;
        RemotePrimitiveTypes remote;

        [TestInitialize]
        public void setUp()
        {
            client = TestUtilsHttp.createClient();
            remote = client.RemotePrimitiveTypes;
        }

        [TestCleanup]
        public void tearDown()
        {
            client.done();
        }

        [TestMethod]
        public void TestPrimitiveTypes()
        {
            log.info("TestPrimitiveTypes(");
            try
            {
                remote.SetBool(true);
                Assert.AreEqual(true, remote.GetBool());
                remote.SetBool(false);
                TestUtils.assertEquals(log, "bool", false, remote.GetBool());
                remote.SetByte((byte)11);
                TestUtils.assertEquals(log, "byte", (byte)11, remote.GetByte());
                remote.SetChar('€');
                TestUtils.assertEquals(log, "char", '€', remote.GetChar());
                remote.SetShort((short)1234);
                TestUtils.assertEquals(log, "short", (short)1234, remote.GetShort());
                remote.SetInt(5678);
                TestUtils.assertEquals(log, "int", 5678, remote.GetInt());
                remote.SetLong(890L);
                TestUtils.assertEquals(log, "long", 890L, remote.GetLong());
                remote.SetFloat(1.2f);
                TestUtils.assertEquals(log, "float", 1.2f, remote.GetFloat());
                remote.SetDouble(1.8);
                TestUtils.assertEquals(log, "double", 1.8, remote.GetDouble());

                remote.SetString("ABC");
                String str = remote.GetString();
                TestUtils.assertEquals(log, "String", "ABC", str);

                PrimitiveTypes pt = TestUtils.createObjectPrimitiveTypes();
                remote.SetObject(pt);
                TestUtils.assertEquals(log, "Object", pt, remote.GetObject());

                pt = TestUtils.createObjectPrimitiveTypes();
                remote.SetPrimitiveTypes(pt);
                TestUtils.assertEquals(log, "PrimitiveTypes", pt, remote.GetPrimitiveTypes());
            }
            catch (BException e)
            {
                Assert.Fail(e.ToString());
            }

            log.info(")TestPrimitiveTypes");
        }

        [TestMethod]
        public void testRemotePrimitiveTypesSendAll()
        {
            log.info("testRemotePrimitiveTypesSendAll(");

            PrimitiveTypes pt = TestUtils.createObjectPrimitiveTypes();
            PrimitiveTypes pt2 = TestUtils.createObjectPrimitiveTypes();
            remote.SendAllTypes(true, 'Q', (short)34, 56, 45, 7.4f, 9.8, "23", pt, pt2);

            TestUtils.assertEquals(log, "bool", true, remote.GetBool());
            TestUtils.assertEquals(log, "char", 'Q', remote.GetChar());
            TestUtils.assertEquals(log, "short", (short)34, remote.GetShort());
            TestUtils.assertEquals(log, "int", 56, remote.GetInt());
            TestUtils.assertEquals(log, "long", 45L, remote.GetLong());
            TestUtils.assertEquals(log, "float", 7.4f, remote.GetFloat());
            TestUtils.assertEquals(log, "double", 9.8, remote.GetDouble());
            TestUtils.assertEquals(log, "String", "23", remote.GetString());
            TestUtils.assertEquals(log, "Object", pt2, remote.GetObject());
            TestUtils.assertEquals(log, "PrimtitiveTypes", pt, remote.GetPrimitiveTypes());

            log.info(")testRemotePrimitiveTypesSendAll");
        }

        [TestMethod]
        public void testRemotePrimitiveTypesAsync()
        {
            log.info("testRemotePrimitiveTypesAsync(");

            BSyncResult<Object> result = new BSyncResult<Object>();
            remote.async_SetInt(1122, result);
            result.GetResult();

            BSyncResult<int> result2 = new BSyncResult<int>();
            remote.async_GetInt(result2);
            int valueR = result2.GetResult();
            TestUtils.assertEquals(log, "async_getInt", 1122, valueR);

            log.info(")testRemotePrimitiveTypesAsync");
        }

    }
}
