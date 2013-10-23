package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_RemoteArrayTypes4dim extends BStub implements RemoteArrayTypes4dimAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 963726955L;
	
	public BStub_RemoteArrayTypes4dim(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setBool(boolean[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setBool(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setBool(boolean[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setBool req = new BRequest_RemoteArrayTypes4dim_setBool();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setByte(byte[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setByte(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setByte(byte[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setByte req = new BRequest_RemoteArrayTypes4dim_setByte();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setChar(char[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setChar(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setChar(char[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setChar req = new BRequest_RemoteArrayTypes4dim_setChar();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setShort(short[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setShort(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setShort(short[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setShort req = new BRequest_RemoteArrayTypes4dim_setShort();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setInt(int[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setInt(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setInt(int[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setInt req = new BRequest_RemoteArrayTypes4dim_setInt();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setLong(long[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setLong(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setLong(long[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setLong req = new BRequest_RemoteArrayTypes4dim_setLong();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setFloat(float[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setFloat(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setFloat(float[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setFloat req = new BRequest_RemoteArrayTypes4dim_setFloat();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setDouble(double[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setDouble(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setDouble(double[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setDouble req = new BRequest_RemoteArrayTypes4dim_setDouble();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setString(java.lang.String[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setString(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setString(java.lang.String[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setString req = new BRequest_RemoteArrayTypes4dim_setString();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setPrimitiveTypes(byps.test.api.prim.PrimitiveTypes[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setPrimitiveTypes(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setPrimitiveTypes(byps.test.api.prim.PrimitiveTypes[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setPrimitiveTypes req = new BRequest_RemoteArrayTypes4dim_setPrimitiveTypes();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setObject(java.lang.Object[][][][] v) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setObject(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setObject(java.lang.Object[][][][] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_setObject req = new BRequest_RemoteArrayTypes4dim_setObject();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public boolean[][][][] getBool() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<boolean[][][][]> asyncResult = new BSyncResult<boolean[][][][]>();		
		getBool(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getBool(final BAsyncResult<boolean[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getBool req = new BRequest_RemoteArrayTypes4dim_getBool();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public byte[][][][] getByte() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<byte[][][][]> asyncResult = new BSyncResult<byte[][][][]>();		
		getByte(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getByte(final BAsyncResult<byte[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getByte req = new BRequest_RemoteArrayTypes4dim_getByte();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public char[][][][] getChar() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<char[][][][]> asyncResult = new BSyncResult<char[][][][]>();		
		getChar(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getChar(final BAsyncResult<char[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getChar req = new BRequest_RemoteArrayTypes4dim_getChar();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public short[][][][] getShort() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<short[][][][]> asyncResult = new BSyncResult<short[][][][]>();		
		getShort(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getShort(final BAsyncResult<short[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getShort req = new BRequest_RemoteArrayTypes4dim_getShort();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public int[][][][] getInt() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<int[][][][]> asyncResult = new BSyncResult<int[][][][]>();		
		getInt(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getInt(final BAsyncResult<int[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getInt req = new BRequest_RemoteArrayTypes4dim_getInt();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public long[][][][] getLong() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<long[][][][]> asyncResult = new BSyncResult<long[][][][]>();		
		getLong(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getLong(final BAsyncResult<long[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getLong req = new BRequest_RemoteArrayTypes4dim_getLong();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public float[][][][] getFloat() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<float[][][][]> asyncResult = new BSyncResult<float[][][][]>();		
		getFloat(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getFloat(final BAsyncResult<float[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getFloat req = new BRequest_RemoteArrayTypes4dim_getFloat();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public double[][][][] getDouble() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<double[][][][]> asyncResult = new BSyncResult<double[][][][]>();		
		getDouble(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getDouble(final BAsyncResult<double[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getDouble req = new BRequest_RemoteArrayTypes4dim_getDouble();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.lang.String[][][][] getString() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.lang.String[][][][]> asyncResult = new BSyncResult<java.lang.String[][][][]>();		
		getString(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getString(final BAsyncResult<java.lang.String[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getString req = new BRequest_RemoteArrayTypes4dim_getString();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public byps.test.api.prim.PrimitiveTypes[][][][] getPrimitiveTypes() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<byps.test.api.prim.PrimitiveTypes[][][][]> asyncResult = new BSyncResult<byps.test.api.prim.PrimitiveTypes[][][][]>();		
		getPrimitiveTypes(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getPrimitiveTypes(final BAsyncResult<byps.test.api.prim.PrimitiveTypes[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getPrimitiveTypes req = new BRequest_RemoteArrayTypes4dim_getPrimitiveTypes();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public java.lang.Object[][][][] getObject() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.lang.Object[][][][]> asyncResult = new BSyncResult<java.lang.Object[][][][]>();		
		getObject(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getObject(final BAsyncResult<java.lang.Object[][][][]> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes4dim_getObject req = new BRequest_RemoteArrayTypes4dim_getObject();		
		transport.sendMethod(req, asyncResult);
	}
	
	
}
