/**
 * 
 */
package com.balaji.assignment.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author spaneos
 *
 */
public class PhoneBook {
	Map<String,String> map=new HashMap<>();
	/**
	 * Parameterized Constructor
	 * @param phno Phone number
	 * @param name Name of the number
	 */
	public  void addDetails(String phno,String name){
		map.put(phno, name);
	}
	/**
	 * This method is used to get the corresponding name of the number
	 * @param phno Phone number
	 * @return The name of the given number
	 */
	public String getName(String phno){
		String s= map.get(phno);
		return s;
	}
}
