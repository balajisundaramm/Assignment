package com.balaji.assignment.exception.dbConnection;

import com.balaji.assignment.customexception.MultipleObjectCreationRestrictedException;
/**
 * 
 * @author spaneos
 *
 */
public class DbConnection {
	private static DbConnection connection=null;

	private DbConnection() {
		super();
	}
	/**
	 * 
	 * @return DbConnection object
	 * @throws MultipleObjectCreationRestrictedException Restricting to create multiple objects.
	 */
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
