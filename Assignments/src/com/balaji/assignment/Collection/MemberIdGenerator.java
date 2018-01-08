/**
 * 
 */
package com.balaji.assignment.Collection;

/**
 * @author spaneos
 *
 */
public class MemberIdGenerator {
	 private static int count=5005;
	    public static String suffix="IND";
	    public static String prefix="ASHO";
	    /**
	     * Auto Generate Member ID
	     * @return member ID
	     */
	    public static String getMemberId(){
	        String id=prefix+count+++suffix;
	        return id;
	    }
}
