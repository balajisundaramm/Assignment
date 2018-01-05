package com.balaji.assignment.exception;

public class DbConnection {
	private static DbConnection connection=null;

	private DbConnection() {
		super();
	}
	public static DbConnection getObject() throws MultipleObjectCreationRestrictedException {
		if(connection==null) {
			connection=new DbConnection();
			return connection;
		}
		else {
			throw new MultipleObjectCreationRestrictedException("Singlton object only allowed");
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DbConnection";
	}
	
}
class MultipleObjectCreationRestrictedException extends Exception{

	public MultipleObjectCreationRestrictedException(String message) {
		super(message);
	}
	
}
