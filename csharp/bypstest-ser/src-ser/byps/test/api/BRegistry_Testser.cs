﻿using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api
{
	
	public class BRegistry_Testser : BRegistry { 
	
		public BRegistry_Testser()
			: base(BBinaryModel.MEDIUM) {}
		
		public override BSerializer getApiSerializer(int typeId) {
			// boolean[]
			if (typeId == 2058423690) return byps.test.api.BSerializer_2058423690.instance;
			// boolean[][][][]
			if (typeId == 945713488) return byps.test.api.BSerializer_945713488.instance;
			// byps.test.api.BResult_1
			if (typeId == 432867947) return byps.test.api.BSerializer_432867947.instance;
			// byps.test.api.BResult_10
			if (typeId == 534004421) return byps.test.api.BSerializer_534004421.instance;
			// byps.test.api.BResult_1000
			if (typeId == 2077138821) return byps.test.api.BSerializer_2077138821.instance;
			// byps.test.api.BResult_100361105
			if (typeId == 498939805) return byps.test.api.BSerializer_498939805.instance;
			// byps.test.api.BResult_1050216688
			if (typeId == 70523627) return byps.test.api.BSerializer_70523627.instance;
			// byps.test.api.BResult_1059148284
			if (typeId == 698727944) return byps.test.api.BSerializer_698727944.instance;
			// byps.test.api.BResult_1097129250
			if (typeId == 200721390) return byps.test.api.BSerializer_200721390.instance;
			// byps.test.api.BResult_1174971318
			if (typeId == 1068483136) return byps.test.api.BSerializer_1068483136.instance;
			// byps.test.api.BResult_12
			if (typeId == 534004419) return byps.test.api.BSerializer_534004419.instance;
			// byps.test.api.BResult_1201775504
			if (typeId == 1521577218) return byps.test.api.BSerializer_1521577218.instance;
			// byps.test.api.BResult_1218831438
			if (typeId == 911793767) return byps.test.api.BSerializer_911793767.instance;
			// byps.test.api.BResult_124584219
			if (typeId == 996163680) return byps.test.api.BSerializer_996163680.instance;
			// byps.test.api.BResult_1279823631
			if (typeId == 629604454) return byps.test.api.BSerializer_629604454.instance;
			// byps.test.api.BResult_1320560671
			if (typeId == 2041057155) return byps.test.api.BSerializer_2041057155.instance;
			// byps.test.api.BResult_1347703734
			if (typeId == 881037921) return byps.test.api.BSerializer_881037921.instance;
			// byps.test.api.BResult_1358523233
			if (typeId == 1693860029) return byps.test.api.BSerializer_1693860029.instance;
			// byps.test.api.BResult_1359468275
			if (typeId == 1738389572) return byps.test.api.BSerializer_1738389572.instance;
			// byps.test.api.BResult_1361632968
			if (typeId == 1548641599) return byps.test.api.BSerializer_1548641599.instance;
			// byps.test.api.BResult_1365696060
			if (typeId == 809340660) return byps.test.api.BSerializer_809340660.instance;
			// byps.test.api.BResult_1374008726
			if (typeId == 1484626910) return byps.test.api.BSerializer_1484626910.instance;
			// byps.test.api.BResult_1375035164
			if (typeId == 1920161159) return byps.test.api.BSerializer_1920161159.instance;
			// byps.test.api.BResult_1391985860
			if (typeId == 1722268526) return byps.test.api.BSerializer_1722268526.instance;
			// byps.test.api.BResult_14
			if (typeId == 534004417) return byps.test.api.BSerializer_534004417.instance;
			// byps.test.api.BResult_1406124761
			if (typeId == 2127200796) return byps.test.api.BSerializer_2127200796.instance;
			// byps.test.api.BResult_1457164460
			if (typeId == 1111888832) return byps.test.api.BSerializer_1111888832.instance;
			// byps.test.api.BResult_1487265161
			if (typeId == 149769063) return byps.test.api.BSerializer_149769063.instance;
			// byps.test.api.BResult_1488550492
			if (typeId == 822552572) return byps.test.api.BSerializer_822552572.instance;
			// byps.test.api.BResult_1493282670
			if (typeId == 1955210948) return byps.test.api.BSerializer_1955210948.instance;
			// byps.test.api.BResult_15
			if (typeId == 534004416) return byps.test.api.BSerializer_534004416.instance;
			// byps.test.api.BResult_1516687588
			if (typeId == 2043070523) return byps.test.api.BSerializer_2043070523.instance;
			// byps.test.api.BResult_1555345627
			if (typeId == 343940505) return byps.test.api.BSerializer_343940505.instance;
			// byps.test.api.BResult_1596367810
			if (typeId == 1073221568) return byps.test.api.BSerializer_1073221568.instance;
			// byps.test.api.BResult_16
			if (typeId == 534004415) return byps.test.api.BSerializer_534004415.instance;
			// byps.test.api.BResult_1617670280
			if (typeId == 1330811042) return byps.test.api.BSerializer_1330811042.instance;
			// byps.test.api.BResult_1628501332
			if (typeId == 368905437) return byps.test.api.BSerializer_368905437.instance;
			// byps.test.api.BResult_1633500852
			if (typeId == 1231328865) return byps.test.api.BSerializer_1231328865.instance;
			// byps.test.api.BResult_1633750383
			if (typeId == 1293200061) return byps.test.api.BSerializer_1293200061.instance;
			// byps.test.api.BResult_1661807911
			if (typeId == 475882038) return byps.test.api.BSerializer_475882038.instance;
			// byps.test.api.BResult_1710660846
			if (typeId == 1899847531) return byps.test.api.BSerializer_1899847531.instance;
			// byps.test.api.BResult_171948703
			if (typeId == 871356108) return byps.test.api.BSerializer_871356108.instance;
			// byps.test.api.BResult_1746702954
			if (typeId == 408452669) return byps.test.api.BSerializer_408452669.instance;
			// byps.test.api.BResult_1752158699
			if (typeId == 1912328929) return byps.test.api.BSerializer_1912328929.instance;
			// byps.test.api.BResult_1799280818
			if (typeId == 2052610089) return byps.test.api.BSerializer_2052610089.instance;
			// byps.test.api.BResult_181681714
			if (typeId == 1763202727) return byps.test.api.BSerializer_1763202727.instance;
			// byps.test.api.BResult_1823330785
			if (typeId == 114088296) return byps.test.api.BSerializer_114088296.instance;
			// byps.test.api.BResult_1831201218
			if (typeId == 50516327) return byps.test.api.BSerializer_50516327.instance;
			// byps.test.api.BResult_183594037
			if (typeId == 15818284) return byps.test.api.BSerializer_15818284.instance;
			// byps.test.api.BResult_184101377
			if (typeId == 748770738) return byps.test.api.BSerializer_748770738.instance;
			// byps.test.api.BResult_1859644668
			if (typeId == 2130431383) return byps.test.api.BSerializer_2130431383.instance;
			// byps.test.api.BResult_1888107655
			if (typeId == 2063745441) return byps.test.api.BSerializer_2063745441.instance;
			// byps.test.api.BResult_1888799711
			if (typeId == 2051074845) return byps.test.api.BSerializer_2051074845.instance;
			// byps.test.api.BResult_1898022288
			if (typeId == 515346332) return byps.test.api.BSerializer_515346332.instance;
			// byps.test.api.BResult_19
			if (typeId == 534004412) return byps.test.api.BSerializer_534004412.instance;
			// byps.test.api.BResult_1972793385
			if (typeId == 1958357790) return byps.test.api.BSerializer_1958357790.instance;
			// byps.test.api.BResult_1973996106
			if (typeId == 1391760319) return byps.test.api.BSerializer_1391760319.instance;
			// byps.test.api.BResult_1997002548
			if (typeId == 1082818537) return byps.test.api.BSerializer_1082818537.instance;
			// byps.test.api.BResult_2
			if (typeId == 432867946) return byps.test.api.BSerializer_432867946.instance;
			// byps.test.api.BResult_2028443792
			if (typeId == 1664501789) return byps.test.api.BSerializer_1664501789.instance;
			// byps.test.api.BResult_2052431866
			if (typeId == 1566928477) return byps.test.api.BSerializer_1566928477.instance;
			// byps.test.api.BResult_2053507648
			if (typeId == 1814499786) return byps.test.api.BSerializer_1814499786.instance;
			// byps.test.api.BResult_2058423690
			if (typeId == 1698849803) return byps.test.api.BSerializer_1698849803.instance;
			// byps.test.api.BResult_2064980445
			if (typeId == 937508540) return byps.test.api.BSerializer_937508540.instance;
			// byps.test.api.BResult_2067161310
			if (typeId == 925799231) return byps.test.api.BSerializer_925799231.instance;
			// byps.test.api.BResult_2087445849
			if (typeId == 1650981375) return byps.test.api.BSerializer_1650981375.instance;
			// byps.test.api.BResult_21
			if (typeId == 534004389) return byps.test.api.BSerializer_534004389.instance;
			// byps.test.api.BResult_2123584667
			if (typeId == 253151806) return byps.test.api.BSerializer_253151806.instance;
			// byps.test.api.BResult_3
			if (typeId == 432867945) return byps.test.api.BSerializer_432867945.instance;
			// byps.test.api.BResult_31512998
			if (typeId == 1620912700) return byps.test.api.BSerializer_1620912700.instance;
			// byps.test.api.BResult_39910537
			if (typeId == 245460547) return byps.test.api.BSerializer_245460547.instance;
			// byps.test.api.BResult_4
			if (typeId == 432867944) return byps.test.api.BSerializer_432867944.instance;
			// byps.test.api.BResult_476459792
			if (typeId == 255681041) return byps.test.api.BSerializer_255681041.instance;
			// byps.test.api.BResult_5
			if (typeId == 432867943) return byps.test.api.BSerializer_432867943.instance;
			// byps.test.api.BResult_564008001
			if (typeId == 1405156912) return byps.test.api.BSerializer_1405156912.instance;
			// byps.test.api.BResult_588723219
			if (typeId == 1537615291) return byps.test.api.BSerializer_1537615291.instance;
			// byps.test.api.BResult_6
			if (typeId == 432867942) return byps.test.api.BSerializer_432867942.instance;
			// byps.test.api.BResult_601099730
			if (typeId == 856233055) return byps.test.api.BSerializer_856233055.instance;
			// byps.test.api.BResult_65775978
			if (typeId == 1872312576) return byps.test.api.BSerializer_1872312576.instance;
			// byps.test.api.BResult_673917574
			if (typeId == 2098743607) return byps.test.api.BSerializer_2098743607.instance;
			// byps.test.api.BResult_7
			if (typeId == 432867941) return byps.test.api.BSerializer_432867941.instance;
			// byps.test.api.BResult_7007
			if (typeId == 2076960068) return byps.test.api.BSerializer_2076960068.instance;
			// byps.test.api.BResult_758319514
			if (typeId == 1168951451) return byps.test.api.BSerializer_1168951451.instance;
			// byps.test.api.BResult_766441794
			if (typeId == 1167917980) return byps.test.api.BSerializer_1167917980.instance;
			// byps.test.api.BResult_769021986
			if (typeId == 580900026) return byps.test.api.BSerializer_580900026.instance;
			// byps.test.api.BResult_8
			if (typeId == 432867940) return byps.test.api.BSerializer_432867940.instance;
			// byps.test.api.BResult_846419204
			if (typeId == 167272824) return byps.test.api.BSerializer_167272824.instance;
			// byps.test.api.BResult_8789515
			if (typeId == 323111619) return byps.test.api.BSerializer_323111619.instance;
			// byps.test.api.BResult_9001
			if (typeId == 2076900492) return byps.test.api.BSerializer_2076900492.instance;
			// byps.test.api.BResult_936607009
			if (typeId == 968248604) return byps.test.api.BSerializer_968248604.instance;
			// byps.test.api.BResult_94341197
			if (typeId == 1800858646) return byps.test.api.BSerializer_1800858646.instance;
			// byps.test.api.BResult_945713488
			if (typeId == 1852992857) return byps.test.api.BSerializer_1852992857.instance;
			// byps.test.api.BResult_949340697
			if (typeId == 996206823) return byps.test.api.BSerializer_996206823.instance;
			// byps.test.api.BResult_955752991
			if (typeId == 695494982) return byps.test.api.BSerializer_695494982.instance;
			// byps.test.api.arr.ArrayTypes1dim
			if (typeId == 2001) return byps.test.api.arr.BSerializer_2001.instance;
			// byps.test.api.arr.ArrayTypes4dim
			if (typeId == 2004) return byps.test.api.arr.BSerializer_2004.instance;
			// byps.test.api.auth.SessionInfo
			if (typeId == 65775978) return byps.test.api.auth.BSerializer_65775978.instance;
			// byps.test.api.cons.AllTypesC
			if (typeId == 930294276) return byps.test.api.cons.BSerializer_930294276.instance;
			// byps.test.api.cons.AllTypesZ
			if (typeId == 142458) return byps.test.api.cons.BSerializer_142458.instance;
			// byps.test.api.cons.AllTypesZ[][]
			if (typeId == 81775365) return byps.test.api.BSerializer_81775365.instance;
			// byps.test.api.cons.HebrewC
			if (typeId == 691741677) return byps.test.api.cons.BSerializer_691741677.instance;
			// byps.test.api.cons.HebrewZ
			if (typeId == 1518668429) return byps.test.api.cons.BSerializer_1518668429.instance;
			// byps.test.api.cons.HebrewZ[]
			if (typeId == 92445340) return byps.test.api.BSerializer_92445340.instance;
			// byps.test.api.enu.EnumPlanets[]
			if (typeId == 1441131650) return byps.test.api.BSerializer_1441131650.instance;
			// byps.test.api.enu.UsePlanets
			if (typeId == 10000) return byps.test.api.enu.BSerializer_10000.instance;
			// byps.test.api.inherit.BRequest_BioFruitService_certify
			if (typeId == 1435417025) return byps.test.api.inherit.BSerializer_1435417025.instance;
			// byps.test.api.inherit.BRequest_BioLemonService_useParing
			if (typeId == 2108700976) return byps.test.api.inherit.BSerializer_2108700976.instance;
			// byps.test.api.inherit.BRequest_FruitService_squeeze
			if (typeId == 1290167289) return byps.test.api.inherit.BSerializer_1290167289.instance;
			// byps.test.api.inherit.BRequest_LemonService_pick
			if (typeId == 1022088379) return byps.test.api.inherit.BSerializer_1022088379.instance;
			// byps.test.api.inherit.BRequest_PlantService_grow
			if (typeId == 695716901) return byps.test.api.inherit.BSerializer_695716901.instance;
			// byps.test.api.inherit.BStub_BioFruitService
			if (typeId == 363642571) return byps.test.api.inherit.BSerializer_363642571.instance;
			// byps.test.api.inherit.BStub_BioLemonService
			if (typeId == 474058508) return byps.test.api.inherit.BSerializer_474058508.instance;
			// byps.test.api.inherit.BStub_FruitService
			if (typeId == 715959905) return byps.test.api.inherit.BSerializer_715959905.instance;
			// byps.test.api.inherit.BStub_LemonService
			if (typeId == 605543968) return byps.test.api.inherit.BSerializer_605543968.instance;
			// byps.test.api.inherit.BStub_PlantService
			if (typeId == 1954605928) return byps.test.api.inherit.BSerializer_1954605928.instance;
			// byps.test.api.inherit.Class1
			if (typeId == 6001) return byps.test.api.inherit.BSerializer_6001.instance;
			// byps.test.api.inherit.Class1Collections
			if (typeId == 6004) return byps.test.api.inherit.BSerializer_6004.instance;
			// byps.test.api.inherit.Class2
			if (typeId == 6002) return byps.test.api.inherit.BSerializer_6002.instance;
			// byps.test.api.inherit.Class3
			if (typeId == 6003) return byps.test.api.inherit.BSerializer_6003.instance;
			// byps.test.api.inl.Actor
			if (typeId == 171948703) return byps.test.api.inl.BSerializer_171948703.instance;
			// byps.test.api.inl.Matrix2D
			if (typeId == 135329019) return byps.test.api.inl.BSerializer_135329019.instance;
			// byps.test.api.inl.Point2D
			if (typeId == 1835035436) return byps.test.api.inl.BSerializer_1835035436.instance;
			// byps.test.api.inl.Point2D[]
			if (typeId == 184101377) return byps.test.api.BSerializer_184101377.instance;
			// byps.test.api.inl.Point2D[][]
			if (typeId == 827767075) return byps.test.api.BSerializer_827767075.instance;
			// byps.test.api.inl.Point2D[][][]
			if (typeId == 915212229) return byps.test.api.BSerializer_915212229.instance;
			// byps.test.api.inl.Point2D[][][][]
			if (typeId == 949340697) return byps.test.api.BSerializer_949340697.instance;
			// byps.test.api.list.ListListTypes
			if (typeId == 3002) return byps.test.api.list.BSerializer_3002.instance;
			// byps.test.api.list.ListTypes
			if (typeId == 3001) return byps.test.api.list.BSerializer_3001.instance;
			// byps.test.api.map.MapTypes
			if (typeId == 4001) return byps.test.api.map.BSerializer_4001.instance;
			// byps.test.api.prim.PrimitiveTypes
			if (typeId == 1000) return byps.test.api.prim.BSerializer_1000.instance;
			// byps.test.api.prim.PrimitiveTypes[]
			if (typeId == 2053507648) return byps.test.api.BSerializer_2053507648.instance;
			// byps.test.api.prim.PrimitiveTypes[][]
			if (typeId == 2030857950) return byps.test.api.BSerializer_2030857950.instance;
			// byps.test.api.prim.PrimitiveTypes[][][]
			if (typeId == 1739334652) return byps.test.api.BSerializer_1739334652.instance;
			// byps.test.api.prim.PrimitiveTypes[][][][]
			if (typeId == 758319514) return byps.test.api.BSerializer_758319514.instance;
			// byps.test.api.priv.PrivateMembers
			if (typeId == 8001) return byps.test.api.priv.BSerializer_8001.instance;
			// byps.test.api.refs.Node
			if (typeId == 9001) return byps.test.api.refs.BSerializer_9001.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getBool
			if (typeId == 2033416644) return byps.test.api.remote.BSerializer_2033416644.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getByte
			if (typeId == 2033426402) return byps.test.api.remote.BSerializer_2033426402.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getChar
			if (typeId == 2033439280) return byps.test.api.remote.BSerializer_2033439280.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getDouble
			if (typeId == 39293909) return byps.test.api.remote.BSerializer_39293909.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getFloat
			if (typeId == 1384988990) return byps.test.api.remote.BSerializer_1384988990.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getInt
			if (typeId == 1874061867) return byps.test.api.remote.BSerializer_1874061867.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getLong
			if (typeId == 2033714518) return byps.test.api.remote.BSerializer_2033714518.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getObject
			if (typeId == 263295897) return byps.test.api.remote.BSerializer_263295897.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getPrimitiveTypes
			if (typeId == 1992537556) return byps.test.api.remote.BSerializer_1992537556.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getShort
			if (typeId == 1373101854) return byps.test.api.remote.BSerializer_1373101854.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getString
			if (typeId == 394678379) return byps.test.api.remote.BSerializer_394678379.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setBool
			if (typeId == 201441072) return byps.test.api.remote.BSerializer_201441072.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setByte
			if (typeId == 201431314) return byps.test.api.remote.BSerializer_201431314.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setChar
			if (typeId == 201418436) return byps.test.api.remote.BSerializer_201418436.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setDouble
			if (typeId == 253910985) return byps.test.api.remote.BSerializer_253910985.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setFloat
			if (typeId == 1946101450) return byps.test.api.remote.BSerializer_1946101450.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setInt
			if (typeId == 1530512055) return byps.test.api.remote.BSerializer_1530512055.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setLong
			if (typeId == 201143198) return byps.test.api.remote.BSerializer_201143198.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setObject
			if (typeId == 48678821) return byps.test.api.remote.BSerializer_48678821.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setPrimitiveTypes
			if (typeId == 1362276920) return byps.test.api.remote.BSerializer_1362276920.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setShort
			if (typeId == 1934214314) return byps.test.api.remote.BSerializer_1934214314.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setString
			if (typeId == 180061303) return byps.test.api.remote.BSerializer_180061303.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysClass
			if (typeId == 330036060) return byps.test.api.remote.BSerializer_330036060.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysInline
			if (typeId == 1467243283) return byps.test.api.remote.BSerializer_1467243283.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysInt
			if (typeId == 1828268517) return byps.test.api.remote.BSerializer_1828268517.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysObject
			if (typeId == 1306614381) return byps.test.api.remote.BSerializer_1306614381.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysString
			if (typeId == 1175231899) return byps.test.api.remote.BSerializer_1175231899.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getBool
			if (typeId == 1874302495) return byps.test.api.remote.BSerializer_1874302495.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getByte
			if (typeId == 1874292737) return byps.test.api.remote.BSerializer_1874292737.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getChar
			if (typeId == 1874279859) return byps.test.api.remote.BSerializer_1874279859.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getDouble
			if (typeId == 1555969784) return byps.test.api.remote.BSerializer_1555969784.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getFloat
			if (typeId == 2029769285) return byps.test.api.remote.BSerializer_2029769285.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getInt
			if (typeId == 1325018648) return byps.test.api.remote.BSerializer_1325018648.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getLong
			if (typeId == 1874004621) return byps.test.api.remote.BSerializer_1874004621.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getObject
			if (typeId == 1253379978) return byps.test.api.remote.BSerializer_1253379978.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getPrimitiveTypes
			if (typeId == 483228169) return byps.test.api.remote.BSerializer_483228169.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getShort
			if (typeId == 2041656421) return byps.test.api.remote.BSerializer_2041656421.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_getString
			if (typeId == 1121997496) return byps.test.api.remote.BSerializer_1121997496.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setBool
			if (typeId == 185807085) return byps.test.api.remote.BSerializer_185807085.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setByte
			if (typeId == 185816843) return byps.test.api.remote.BSerializer_185816843.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setChar
			if (typeId == 185829721) return byps.test.api.remote.BSerializer_185829721.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setDouble
			if (typeId == 1770586860) return byps.test.api.remote.BSerializer_1770586860.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setFloat
			if (typeId == 1468656825) return byps.test.api.remote.BSerializer_1468656825.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setInt
			if (typeId == 1668568460) return byps.test.api.remote.BSerializer_1668568460.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setLong
			if (typeId == 186104959) return byps.test.api.remote.BSerializer_186104959.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setObject
			if (typeId == 1467997054) return byps.test.api.remote.BSerializer_1467997054.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setPrimitiveTypes
			if (typeId == 456924651) return byps.test.api.remote.BSerializer_456924651.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setShort
			if (typeId == 1480543961) return byps.test.api.remote.BSerializer_1480543961.instance;
			// byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setString
			if (typeId == 1336614572) return byps.test.api.remote.BSerializer_1336614572.instance;
			// byps.test.api.remote.BRequest_RemoteConstants_compare_AllTypesC
			if (typeId == 1609344203) return byps.test.api.remote.BSerializer_1609344203.instance;
			// byps.test.api.remote.BRequest_RemoteConstants_compare_HebrewC
			if (typeId == 1711871378) return byps.test.api.remote.BSerializer_1711871378.instance;
			// byps.test.api.remote.BRequest_RemoteEnums_getPlanet
			if (typeId == 6352043) return byps.test.api.remote.BSerializer_6352043.instance;
			// byps.test.api.remote.BRequest_RemoteEnums_setPlanet
			if (typeId == 220969119) return byps.test.api.remote.BSerializer_220969119.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_getActor
			if (typeId == 600892860) return byps.test.api.remote.BSerializer_600892860.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DArray1dim
			if (typeId == 188393247) return byps.test.api.remote.BSerializer_188393247.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DArray4dim
			if (typeId == 188482620) return byps.test.api.remote.BSerializer_188482620.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DList
			if (typeId == 1428313263) return byps.test.api.remote.BSerializer_1428313263.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DListList
			if (typeId == 1650554387) return byps.test.api.remote.BSerializer_1650554387.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DMap
			if (typeId == 646661333) return byps.test.api.remote.BSerializer_646661333.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_setActor
			if (typeId == 1162005320) return byps.test.api.remote.BSerializer_1162005320.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DArray1dim
			if (typeId == 1355334613) return byps.test.api.remote.BSerializer_1355334613.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DArray4dim
			if (typeId == 1355245240) return byps.test.api.remote.BSerializer_1355245240.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DList
			if (typeId == 343422941) return byps.test.api.remote.BSerializer_343422941.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DListList
			if (typeId == 730520735) return byps.test.api.remote.BSerializer_730520735.instance;
			// byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DMap
			if (typeId == 127469879) return byps.test.api.remote.BSerializer_127469879.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getBoolean1
			if (typeId == 2058662161) return byps.test.api.remote.BSerializer_2058662161.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getByte1
			if (typeId == 608486403) return byps.test.api.remote.BSerializer_608486403.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getByte2
			if (typeId == 608486404) return byps.test.api.remote.BSerializer_608486404.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getChar1
			if (typeId == 608885621) return byps.test.api.remote.BSerializer_608885621.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getDouble1
			if (typeId == 2129490906) return byps.test.api.remote.BSerializer_2129490906.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getFloat1
			if (typeId == 1785569467) return byps.test.api.remote.BSerializer_1785569467.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getInt1
			if (typeId == 2098036488) return byps.test.api.remote.BSerializer_2098036488.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getInt2
			if (typeId == 2098036489) return byps.test.api.remote.BSerializer_2098036489.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getInt3
			if (typeId == 2098036490) return byps.test.api.remote.BSerializer_2098036490.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getInt4
			if (typeId == 2098036491) return byps.test.api.remote.BSerializer_2098036491.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getLong1
			if (typeId == 617417999) return byps.test.api.remote.BSerializer_617417999.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getObj1
			if (typeId == 2098203392) return byps.test.api.remote.BSerializer_2098203392.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getPrimitiveTypes1
			if (typeId == 1679973895) return byps.test.api.remote.BSerializer_1679973895.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getShort1
			if (typeId == 2140896613) return byps.test.api.remote.BSerializer_2140896613.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_getString1
			if (typeId == 1597237350) return byps.test.api.remote.BSerializer_1597237350.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setBoolean1
			if (typeId == 2147241989) return byps.test.api.remote.BSerializer_2147241989.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setByte1
			if (typeId == 47373943) return byps.test.api.remote.BSerializer_47373943.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setByte2
			if (typeId == 47373944) return byps.test.api.remote.BSerializer_47373944.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setChar1
			if (typeId == 47773161) return byps.test.api.remote.BSerializer_47773161.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setDouble1
			if (typeId == 228671154) return byps.test.api.remote.BSerializer_228671154.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setFloat1
			if (typeId == 1570952391) return byps.test.api.remote.BSerializer_1570952391.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setInt1
			if (typeId == 136821228) return byps.test.api.remote.BSerializer_136821228.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setInt2
			if (typeId == 136821227) return byps.test.api.remote.BSerializer_136821227.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setInt3
			if (typeId == 136821226) return byps.test.api.remote.BSerializer_136821226.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setInt4
			if (typeId == 136821225) return byps.test.api.remote.BSerializer_136821225.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setLong1
			if (typeId == 56305539) return byps.test.api.remote.BSerializer_56305539.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setObj1
			if (typeId == 136654324) return byps.test.api.remote.BSerializer_136654324.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setPrimitiveTypes1
			if (typeId == 759940243) return byps.test.api.remote.BSerializer_759940243.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setShort1
			if (typeId == 1939453607) return byps.test.api.remote.BSerializer_1939453607.instance;
			// byps.test.api.remote.BRequest_RemoteListTypes_setString1
			if (typeId == 339567886) return byps.test.api.remote.BSerializer_339567886.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getBoolean1
			if (typeId == 885803255) return byps.test.api.remote.BSerializer_885803255.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getByte1
			if (typeId == 124722647) return byps.test.api.remote.BSerializer_124722647.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getByte2
			if (typeId == 124722646) return byps.test.api.remote.BSerializer_124722646.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getChar1
			if (typeId == 124323429) return byps.test.api.remote.BSerializer_124323429.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getDouble1
			if (typeId == 1890230400) return byps.test.api.remote.BSerializer_1890230400.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getFloat1
			if (typeId == 530925397) return byps.test.api.remote.BSerializer_530925397.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getInt1
			if (typeId == 827458594) return byps.test.api.remote.BSerializer_827458594.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getInt2
			if (typeId == 827458595) return byps.test.api.remote.BSerializer_827458595.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getLong1
			if (typeId == 115791051) return byps.test.api.remote.BSerializer_115791051.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getObj1
			if (typeId == 827625498) return byps.test.api.remote.BSerializer_827625498.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getPrimitiveTypes1
			if (typeId == 1745799327) return byps.test.api.remote.BSerializer_1745799327.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getShort1
			if (typeId == 899426613) return byps.test.api.remote.BSerializer_899426613.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_getString1
			if (typeId == 1836497856) return byps.test.api.remote.BSerializer_1836497856.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setBoolean1
			if (typeId == 974383083) return byps.test.api.remote.BSerializer_974383083.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setByte1
			if (typeId == 685835107) return byps.test.api.remote.BSerializer_685835107.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setByte2
			if (typeId == 685835106) return byps.test.api.remote.BSerializer_685835106.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setChar1
			if (typeId == 685435889) return byps.test.api.remote.BSerializer_685435889.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setDouble1
			if (typeId == 467931660) return byps.test.api.remote.BSerializer_467931660.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setFloat1
			if (typeId == 316308321) return byps.test.api.remote.BSerializer_316308321.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setInt1
			if (typeId == 1407399122) return byps.test.api.remote.BSerializer_1407399122.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setInt2
			if (typeId == 1407399121) return byps.test.api.remote.BSerializer_1407399121.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setLong1
			if (typeId == 676903511) return byps.test.api.remote.BSerializer_676903511.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setObj1
			if (typeId == 1407232218) return byps.test.api.remote.BSerializer_1407232218.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setPrimitiveTypes1
			if (typeId == 1629134317) return byps.test.api.remote.BSerializer_1629134317.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setShort1
			if (typeId == 684809537) return byps.test.api.remote.BSerializer_684809537.instance;
			// byps.test.api.remote.BRequest_RemoteMapTypes_setString1
			if (typeId == 100307380) return byps.test.api.remote.BSerializer_100307380.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_add
			if (typeId == 362528512) return byps.test.api.remote.BSerializer_362528512.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getBool
			if (typeId == 1816157633) return byps.test.api.remote.BSerializer_1816157633.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getByte
			if (typeId == 1816147875) return byps.test.api.remote.BSerializer_1816147875.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getChar
			if (typeId == 1816134997) return byps.test.api.remote.BSerializer_1816134997.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getDouble
			if (typeId == 1513332250) return byps.test.api.remote.BSerializer_1513332250.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getFloat
			if (typeId == 462707289) return byps.test.api.remote.BSerializer_462707289.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getInt
			if (typeId == 1582599686) return byps.test.api.remote.BSerializer_1582599686.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getLong
			if (typeId == 1815859759) return byps.test.api.remote.BSerializer_1815859759.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getObject
			if (typeId == 1210742444) return byps.test.api.remote.BSerializer_1210742444.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getPrimitiveTypes
			if (typeId == 714626279) return byps.test.api.remote.BSerializer_714626279.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getShort
			if (typeId == 450820153) return byps.test.api.remote.BSerializer_450820153.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_getString
			if (typeId == 1079359962) return byps.test.api.remote.BSerializer_1079359962.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_sendAllTypes
			if (typeId == 677876863) return byps.test.api.remote.BSerializer_677876863.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setBool
			if (typeId == 243951947) return byps.test.api.remote.BSerializer_243951947.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setByte
			if (typeId == 243961705) return byps.test.api.remote.BSerializer_243961705.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setChar
			if (typeId == 243974583) return byps.test.api.remote.BSerializer_243974583.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setDouble
			if (typeId == 1727949326) return byps.test.api.remote.BSerializer_1727949326.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setFloat
			if (typeId == 1023819749) return byps.test.api.remote.BSerializer_1023819749.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setInt
			if (typeId == 1239049874) return byps.test.api.remote.BSerializer_1239049874.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setLong
			if (typeId == 244249821) return byps.test.api.remote.BSerializer_244249821.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setObject
			if (typeId == 1425359520) return byps.test.api.remote.BSerializer_1425359520.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setPrimitiveTypes
			if (typeId == 225526541) return byps.test.api.remote.BSerializer_225526541.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setShort
			if (typeId == 1011932613) return byps.test.api.remote.BSerializer_1011932613.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_setString
			if (typeId == 1293977038) return byps.test.api.remote.BSerializer_1293977038.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_throwException
			if (typeId == 1278149706) return byps.test.api.remote.BSerializer_1278149706.instance;
			// byps.test.api.remote.BRequest_RemotePrimitiveTypes_voidFunctionVoid
			if (typeId == 2033139391) return byps.test.api.remote.BSerializer_2033139391.instance;
			// byps.test.api.remote.BRequest_RemoteReferences_getNode
			if (typeId == 1366991859) return byps.test.api.remote.BSerializer_1366991859.instance;
			// byps.test.api.remote.BRequest_RemoteReferences_setNode
			if (typeId == 693117721) return byps.test.api.remote.BSerializer_693117721.instance;
			// byps.test.api.remote.BRequest_RemoteServerCtrl_getPublishedRemote
			if (typeId == 648762723) return byps.test.api.remote.BSerializer_648762723.instance;
			// byps.test.api.remote.BRequest_RemoteServerCtrl_publishRemote
			if (typeId == 1543768912) return byps.test.api.remote.BSerializer_1543768912.instance;
			// byps.test.api.remote.BRequest_RemoteServerCtrl_removePublishedRemote
			if (typeId == 135366859) return byps.test.api.remote.BSerializer_135366859.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getBoolean1
			if (typeId == 2114990909) return byps.test.api.remote.BSerializer_2114990909.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getByte1
			if (typeId == 901695825) return byps.test.api.remote.BSerializer_901695825.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getByte2
			if (typeId == 901695824) return byps.test.api.remote.BSerializer_901695824.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getChar1
			if (typeId == 901296607) return byps.test.api.remote.BSerializer_901296607.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getDouble1
			if (typeId == 1751651450) return byps.test.api.remote.BSerializer_1751651450.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getFloat1
			if (typeId == 2080406641) return byps.test.api.remote.BSerializer_2080406641.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getInt1
			if (typeId == 1772226268) return byps.test.api.remote.BSerializer_1772226268.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getInt2
			if (typeId == 1772226269) return byps.test.api.remote.BSerializer_1772226269.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getLong1
			if (typeId == 892764229) return byps.test.api.remote.BSerializer_892764229.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getObj1
			if (typeId == 1772393172) return byps.test.api.remote.BSerializer_1772393172.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getPrimitiveTypes1
			if (typeId == 669274715) return byps.test.api.remote.BSerializer_669274715.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getShort1
			if (typeId == 1711905425) return byps.test.api.remote.BSerializer_1711905425.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_getString1
			if (typeId == 1183412410) return byps.test.api.remote.BSerializer_1183412410.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setBoolean1
			if (typeId == 2091396559) return byps.test.api.remote.BSerializer_2091396559.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setByte1
			if (typeId == 1462808285) return byps.test.api.remote.BSerializer_1462808285.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setByte2
			if (typeId == 1462808284) return byps.test.api.remote.BSerializer_1462808284.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setChar1
			if (typeId == 1462409067) return byps.test.api.remote.BSerializer_1462409067.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setDouble1
			if (typeId == 185153786) return byps.test.api.remote.BSerializer_185153786.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setFloat1
			if (typeId == 1999943579) return byps.test.api.remote.BSerializer_1999943579.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setInt1
			if (typeId == 462631448) return byps.test.api.remote.BSerializer_462631448.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setInt2
			if (typeId == 462631447) return byps.test.api.remote.BSerializer_462631447.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setLong1
			if (typeId == 1453876689) return byps.test.api.remote.BSerializer_1453876689.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setObj1
			if (typeId == 462464544) return byps.test.api.remote.BSerializer_462464544.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setPrimitiveTypes1
			if (typeId == 250758937) return byps.test.api.remote.BSerializer_250758937.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setShort1
			if (typeId == 1926522501) return byps.test.api.remote.BSerializer_1926522501.instance;
			// byps.test.api.remote.BRequest_RemoteSetTypes_setString1
			if (typeId == 753392826) return byps.test.api.remote.BSerializer_753392826.instance;
			// byps.test.api.remote.BRequest_RemoteStreams_getImage
			if (typeId == 61677379) return byps.test.api.remote.BSerializer_61677379.instance;
			// byps.test.api.remote.BRequest_RemoteStreams_getImages
			if (typeId == 1911998634) return byps.test.api.remote.BSerializer_1911998634.instance;
			// byps.test.api.remote.BRequest_RemoteStreams_getTextStream
			if (typeId == 818823403) return byps.test.api.remote.BSerializer_818823403.instance;
			// byps.test.api.remote.BRequest_RemoteStreams_setImage
			if (typeId == 622789839) return byps.test.api.remote.BSerializer_622789839.instance;
			// byps.test.api.remote.BRequest_RemoteStreams_setImages
			if (typeId == 2126615710) return byps.test.api.remote.BSerializer_2126615710.instance;
			// byps.test.api.remote.BRequest_RemoteStreams_throwLastException
			if (typeId == 2127402965) return byps.test.api.remote.BSerializer_2127402965.instance;
			// byps.test.api.remote.BRequest_RemoteWithAuthentication_doit
			if (typeId == 1251509013) return byps.test.api.remote.BSerializer_1251509013.instance;
			// byps.test.api.remote.BRequest_RemoteWithAuthentication_expire
			if (typeId == 72176172) return byps.test.api.remote.BSerializer_72176172.instance;
			// byps.test.api.remote.BRequest_RemoteWithAuthentication_login
			if (typeId == 134687724) return byps.test.api.remote.BSerializer_134687724.instance;
			// byps.test.api.remote.BRequest_RemoteWithAuthentication_setReloginCount
			if (typeId == 802968058) return byps.test.api.remote.BSerializer_802968058.instance;
			// byps.test.api.remote.BRequest_RemoteWithAuthentication_setUseAuthentication
			if (typeId == 946544530) return byps.test.api.remote.BSerializer_946544530.instance;
			// byps.test.api.remote.BStub_RemoteArrayTypes1dim
			if (typeId == 963816328) return byps.test.api.remote.BSerializer_963816328.instance;
			// byps.test.api.remote.BStub_RemoteArrayTypes23
			if (typeId == 769717182) return byps.test.api.remote.BSerializer_769717182.instance;
			// byps.test.api.remote.BStub_RemoteArrayTypes4dim
			if (typeId == 963726955) return byps.test.api.remote.BSerializer_963726955.instance;
			// byps.test.api.remote.BStub_RemoteConstants
			if (typeId == 2045242510) return byps.test.api.remote.BSerializer_2045242510.instance;
			// byps.test.api.remote.BStub_RemoteEnums
			if (typeId == 485761455) return byps.test.api.remote.BSerializer_485761455.instance;
			// byps.test.api.remote.BStub_RemoteInlineInstance
			if (typeId == 567395951) return byps.test.api.remote.BSerializer_567395951.instance;
			// byps.test.api.remote.BStub_RemoteListTypes
			if (typeId == 1233438138) return byps.test.api.remote.BSerializer_1233438138.instance;
			// byps.test.api.remote.BStub_RemoteMapTypes
			if (typeId == 664304990) return byps.test.api.remote.BSerializer_664304990.instance;
			// byps.test.api.remote.BStub_RemotePrimitiveTypes
			if (typeId == 1178916877) return byps.test.api.remote.BSerializer_1178916877.instance;
			// byps.test.api.remote.BStub_RemoteReferences
			if (typeId == 568637225) return byps.test.api.remote.BSerializer_568637225.instance;
			// byps.test.api.remote.BStub_RemoteServerCtrl
			if (typeId == 1652234479) return byps.test.api.remote.BSerializer_1652234479.instance;
			// byps.test.api.remote.BStub_RemoteSetTypes
			if (typeId == 1900796440) return byps.test.api.remote.BSerializer_1900796440.instance;
			// byps.test.api.remote.BStub_RemoteStreams
			if (typeId == 1043578866) return byps.test.api.remote.BSerializer_1043578866.instance;
			// byps.test.api.remote.BStub_RemoteWithAuthentication
			if (typeId == 1983670399) return byps.test.api.remote.BSerializer_1983670399.instance;
			// byps.test.api.set.SetTypes
			if (typeId == 5001) return byps.test.api.set.BSerializer_5001.instance;
			// byps.test.api.srvr.BRequest_ClientIF_getStreams
			if (typeId == 1654980071) return byps.test.api.srvr.BSerializer_1654980071.instance;
			// byps.test.api.srvr.BRequest_ClientIF_incrementInt
			if (typeId == 1685952420) return byps.test.api.srvr.BSerializer_1685952420.instance;
			// byps.test.api.srvr.BRequest_ClientIF_putStreams
			if (typeId == 2016865344) return byps.test.api.srvr.BSerializer_2016865344.instance;
			// byps.test.api.srvr.BRequest_ClientIF_sendChat
			if (typeId == 41050276) return byps.test.api.srvr.BSerializer_41050276.instance;
			// byps.test.api.srvr.BRequest_ServerIF_callClientIncrementInt
			if (typeId == 389860173) return byps.test.api.srvr.BSerializer_389860173.instance;
			// byps.test.api.srvr.BRequest_ServerIF_callClientParallel
			if (typeId == 772308436) return byps.test.api.srvr.BSerializer_772308436.instance;
			// byps.test.api.srvr.BRequest_ServerIF_getClient
			if (typeId == 190669475) return byps.test.api.srvr.BSerializer_190669475.instance;
			// byps.test.api.srvr.BRequest_ServerIF_getClientIds
			if (typeId == 2007476251) return byps.test.api.srvr.BSerializer_2007476251.instance;
			// byps.test.api.srvr.BRequest_ServerIF_getPartner
			if (typeId == 1025664374) return byps.test.api.srvr.BSerializer_1025664374.instance;
			// byps.test.api.srvr.BRequest_ServerIF_getStreamsFromClient
			if (typeId == 1679867754) return byps.test.api.srvr.BSerializer_1679867754.instance;
			// byps.test.api.srvr.BRequest_ServerIF_putStreamsOnClient
			if (typeId == 1934886286) return byps.test.api.srvr.BSerializer_1934886286.instance;
			// byps.test.api.srvr.BRequest_ServerIF_registerWithClientMap
			if (typeId == 1533268444) return byps.test.api.srvr.BSerializer_1533268444.instance;
			// byps.test.api.srvr.BRequest_ServerIF_setPartner
			if (typeId == 1332497686) return byps.test.api.srvr.BSerializer_1332497686.instance;
			// byps.test.api.srvr.BStub_ClientIF
			if (typeId == 2049072174) return byps.test.api.srvr.BSerializer_2049072174.instance;
			// byps.test.api.srvr.BStub_ServerIF
			if (typeId == 1775199834) return byps.test.api.srvr.BSerializer_1775199834.instance;
			// byps.test.api.srvr.ChatStructure
			if (typeId == 7007) return byps.test.api.srvr.BSerializer_7007.instance;
			// byps.test.api.strm.Stream1
			if (typeId == 1541129345) return byps.test.api.strm.BSerializer_1541129345.instance;
			// byps.test.api.ver.BRequest_EvolveIF_getClient
			if (typeId == 1212621223) return byps.test.api.ver.BSerializer_1212621223.instance;
			// byps.test.api.ver.BRequest_EvolveIF_getEvolve
			if (typeId == 1279300441) return byps.test.api.ver.BSerializer_1279300441.instance;
			// byps.test.api.ver.BRequest_EvolveIF_sendEvolveToClient
			if (typeId == 714115141) return byps.test.api.ver.BSerializer_714115141.instance;
			// byps.test.api.ver.BRequest_EvolveIF_setClient
			if (typeId == 998004147) return byps.test.api.ver.BSerializer_998004147.instance;
			// byps.test.api.ver.BRequest_EvolveIF_setEvolve
			if (typeId == 1064683365) return byps.test.api.ver.BSerializer_1064683365.instance;
			// byps.test.api.ver.BStub_EvolveIF
			if (typeId == 15377840) return byps.test.api.ver.BSerializer_15377840.instance;
			// byps.test.api.ver.Evolve
			if (typeId == 1391985860) return byps.test.api.ver.BSerializer_1391985860.instance;
			// byps.test.api.ver.Evolve2
			if (typeId == 573592593) return byps.test.api.ver.BSerializer_573592593.instance;
			// byte[]
			if (typeId == 1374008726) return byps.test.api.BSerializer_1374008726.instance;
			// byte[][][][]
			if (typeId == 1201775504) return byps.test.api.BSerializer_1201775504.instance;
			// char[]
			if (typeId == 1361632968) return byps.test.api.BSerializer_1361632968.instance;
			// char[][][][]
			if (typeId == 769021986) return byps.test.api.BSerializer_769021986.instance;
			// double[]
			if (typeId == 1359468275) return byps.test.api.BSerializer_1359468275.instance;
			// double[][][][]
			if (typeId == 2087445849) return byps.test.api.BSerializer_2087445849.instance;
			// float[]
			if (typeId == 766441794) return byps.test.api.BSerializer_766441794.instance;
			// float[][][][]
			if (typeId == 1516687588) return byps.test.api.BSerializer_1516687588.instance;
			// int[]
			if (typeId == 100361105) return byps.test.api.BSerializer_100361105.instance;
			// int[][]
			if (typeId == 1957744307) return byps.test.api.BSerializer_1957744307.instance;
			// int[][][]
			if (typeId == 196606293) return byps.test.api.BSerializer_196606293.instance;
			// int[][][][]
			if (typeId == 39910537) return byps.test.api.BSerializer_39910537.instance;
			// java.io.InputStream[]
			if (typeId == 1950626768) return byps.test.api.BSerializer_1950626768.instance;
			// java.lang.Object[]
			if (typeId == 183594037) return byps.test.api.BSerializer_183594037.instance;
			// java.lang.Object[][]
			if (typeId == 340213335) return byps.test.api.BSerializer_340213335.instance;
			// java.lang.Object[][][]
			if (typeId == 527503353) return byps.test.api.BSerializer_527503353.instance;
			// java.lang.Object[][][][]
			if (typeId == 124584219) return byps.test.api.BSerializer_124584219.instance;
			// java.lang.String[]
			if (typeId == 1888107655) return byps.test.api.BSerializer_1888107655.instance;
			// java.lang.String[][]
			if (typeId == 1995260457) return byps.test.api.BSerializer_1995260457.instance;
			// java.lang.String[][][]
			if (typeId == 1889888075) return byps.test.api.BSerializer_1889888075.instance;
			// java.lang.String[][][][]
			if (typeId == 588723219) return byps.test.api.BSerializer_588723219.instance;
			// java.util.ArrayList<byps.test.api.enu.EnumPlanets>
			if (typeId == 819140569) return byps.test.api.BSerializer_819140569.instance;
			// java.util.HashMap<java.lang.Double,java.lang.Byte>
			if (typeId == 1972793385) return byps.test.api.BSerializer_1972793385.instance;
			// java.util.HashSet<java.lang.Byte>
			if (typeId == 31512998) return byps.test.api.BSerializer_31512998.instance;
			// java.util.List<byps.test.api.inherit.Class1>
			if (typeId == 510524840) return byps.test.api.BSerializer_510524840.instance;
			// java.util.List<byps.test.api.inl.Point2D>
			if (typeId == 2064980445) return byps.test.api.BSerializer_2064980445.instance;
			// java.util.List<byps.test.api.prim.PrimitiveTypes>
			if (typeId == 1596367810) return byps.test.api.BSerializer_1596367810.instance;
			// java.util.List<byps.test.api.refs.Node>
			if (typeId == 1442786648) return byps.test.api.BSerializer_1442786648.instance;
			// java.util.List<byte[]>
			if (typeId == 1174971318) return byps.test.api.BSerializer_1174971318.instance;
			// java.util.List<int[]>
			if (typeId == 1752158699) return byps.test.api.BSerializer_1752158699.instance;
			// java.util.List<int[][][][]>
			if (typeId == 1088217157) return byps.test.api.BSerializer_1088217157.instance;
			// java.util.List<java.io.InputStream>
			if (typeId == 1218831438) return byps.test.api.BSerializer_1218831438.instance;
			// java.util.List<java.lang.Boolean>
			if (typeId == 1617670280) return byps.test.api.BSerializer_1617670280.instance;
			// java.util.List<java.lang.Byte>
			if (typeId == 1059148284) return byps.test.api.BSerializer_1059148284.instance;
			// java.util.List<java.lang.Character>
			if (typeId == 1661807911) return byps.test.api.BSerializer_1661807911.instance;
			// java.util.List<java.lang.Double>
			if (typeId == 1555345627) return byps.test.api.BSerializer_1555345627.instance;
			// java.util.List<java.lang.Float>
			if (typeId == 1628501332) return byps.test.api.BSerializer_1628501332.instance;
			// java.util.List<java.lang.Integer>
			if (typeId == 181681714) return byps.test.api.BSerializer_181681714.instance;
			// java.util.List<java.lang.Long>
			if (typeId == 1050216688) return byps.test.api.BSerializer_1050216688.instance;
			// java.util.List<java.lang.Short>
			if (typeId == 1997002548) return byps.test.api.BSerializer_1997002548.instance;
			// java.util.List<java.lang.String>
			if (typeId == 2123584667) return byps.test.api.BSerializer_2123584667.instance;
			// java.util.List<java.util.List<byps.test.api.inl.Point2D>>
			if (typeId == 1823330785) return byps.test.api.BSerializer_1823330785.instance;
			// java.util.List<java.util.List<int[][][][]>>
			if (typeId == 1865834185) return byps.test.api.BSerializer_1865834185.instance;
			// java.util.List<java.util.List<java.lang.Integer>>
			if (typeId == 1746702954) return byps.test.api.BSerializer_1746702954.instance;
			// java.util.List<java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>>
			if (typeId == 1633500852) return byps.test.api.BSerializer_1633500852.instance;
			// java.util.List<java.util.TreeSet<java.lang.Integer>>
			if (typeId == 724129228) return byps.test.api.BSerializer_724129228.instance;
			// java.util.Map<java.lang.Byte,java.lang.Double>
			if (typeId == 1487265161) return byps.test.api.BSerializer_1487265161.instance;
			// java.util.Map<java.lang.Character,java.lang.Float>
			if (typeId == 94341197) return byps.test.api.BSerializer_94341197.instance;
			// java.util.Map<java.lang.Integer,byps.test.api.inl.Point2D>
			if (typeId == 1358523233) return byps.test.api.BSerializer_1358523233.instance;
			// java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>
			if (typeId == 1831201218) return byps.test.api.BSerializer_1831201218.instance;
			// java.util.Map<java.lang.Integer,byte[]>
			if (typeId == 1799280818) return byps.test.api.BSerializer_1799280818.instance;
			// java.util.Map<java.lang.Integer,int[]>
			if (typeId == 1633750383) return byps.test.api.BSerializer_1633750383.instance;
			// java.util.Map<java.lang.Integer,java.io.InputStream>
			if (typeId == 779528402) return byps.test.api.BSerializer_779528402.instance;
			// java.util.Map<java.lang.Integer,java.lang.Integer>
			if (typeId == 1347703734) return byps.test.api.BSerializer_1347703734.instance;
			// java.util.Map<java.lang.Integer,java.util.List<java.lang.String>>
			if (typeId == 132175071) return byps.test.api.BSerializer_132175071.instance;
			// java.util.Map<java.lang.Integer,java.util.List<java.util.TreeSet<java.lang.Integer>>>
			if (typeId == 49984088) return byps.test.api.BSerializer_49984088.instance;
			// java.util.Map<java.lang.Long,java.lang.Short>
			if (typeId == 601099730) return byps.test.api.BSerializer_601099730.instance;
			// java.util.Map<java.lang.Short,java.lang.Long>
			if (typeId == 1973996106) return byps.test.api.BSerializer_1973996106.instance;
			// java.util.Map<java.lang.String,byps.test.api.enu.EnumPlanets>
			if (typeId == 493795497) return byps.test.api.BSerializer_493795497.instance;
			// java.util.Map<java.lang.String,byps.test.api.inherit.Class1>
			if (typeId == 2058676657) return byps.test.api.BSerializer_2058676657.instance;
			// java.util.Map<java.lang.String,byps.test.api.refs.Node>
			if (typeId == 2011881553) return byps.test.api.BSerializer_2011881553.instance;
			// java.util.Map<java.lang.String,java.lang.Boolean>
			if (typeId == 1279823631) return byps.test.api.BSerializer_1279823631.instance;
			// java.util.Map<java.lang.String,java.lang.Object>
			if (typeId == 1488550492) return byps.test.api.BSerializer_1488550492.instance;
			// java.util.Map<java.lang.String,java.lang.String>
			if (typeId == 1710660846) return byps.test.api.BSerializer_1710660846.instance;
			// java.util.Set<byps.test.api.inherit.Class1>
			if (typeId == 484881308) return byps.test.api.BSerializer_484881308.instance;
			// java.util.Set<byps.test.api.prim.PrimitiveTypes>
			if (typeId == 673917574) return byps.test.api.BSerializer_673917574.instance;
			// java.util.Set<byte[]>
			if (typeId == 2052431866) return byps.test.api.BSerializer_2052431866.instance;
			// java.util.Set<int[]>
			if (typeId == 1406124761) return byps.test.api.BSerializer_1406124761.instance;
			// java.util.Set<java.lang.Boolean>
			if (typeId == 1365696060) return byps.test.api.BSerializer_1365696060.instance;
			// java.util.Set<java.lang.Double>
			if (typeId == 1320560671) return byps.test.api.BSerializer_1320560671.instance;
			// java.util.Set<java.lang.Float>
			if (typeId == 1898022288) return byps.test.api.BSerializer_1898022288.instance;
			// java.util.Set<java.lang.Integer>
			if (typeId == 1493282670) return byps.test.api.BSerializer_1493282670.instance;
			// java.util.Set<java.lang.Long>
			if (typeId == 1457164460) return byps.test.api.BSerializer_1457164460.instance;
			// java.util.Set<java.lang.Short>
			if (typeId == 2028443792) return byps.test.api.BSerializer_2028443792.instance;
			// java.util.Set<java.lang.String>
			if (typeId == 1888799711) return byps.test.api.BSerializer_1888799711.instance;
			// java.util.TreeMap<java.lang.Float,java.lang.Character>
			if (typeId == 8789515) return byps.test.api.BSerializer_8789515.instance;
			// java.util.TreeMap<java.lang.Integer,java.io.InputStream>
			if (typeId == 476459792) return byps.test.api.BSerializer_476459792.instance;
			// java.util.TreeSet<java.lang.Character>
			if (typeId == 936607009) return byps.test.api.BSerializer_936607009.instance;
			// java.util.TreeSet<java.lang.Integer>
			if (typeId == 855786668) return byps.test.api.BSerializer_855786668.instance;
			// long[]
			if (typeId == 1097129250) return byps.test.api.BSerializer_1097129250.instance;
			// long[][][][]
			if (typeId == 846419204) return byps.test.api.BSerializer_846419204.instance;
			// short[]
			if (typeId == 2067161310) return byps.test.api.BSerializer_2067161310.instance;
			// short[][][][]
			if (typeId == 1859644668) return byps.test.api.BSerializer_1859644668.instance;
			return null;
		}
	}
}