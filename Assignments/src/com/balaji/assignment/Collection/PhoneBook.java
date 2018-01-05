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

	public  void addDetails(String phno,String name){
		map.put(phno, name);
	}

	public String getName(String phno){
		String s= map.get(phno);
		return s;
	}
}
