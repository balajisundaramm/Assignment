package com.balaji.assignment.interfaces;
/**
 * 
 * @author spaneos
 *
 */
public class UserList implements MyIterator{
	 private String[] name;
	 private int index;

	 /**
	  * Constructor- used to instantiate the object
	  * @param name input value
	  */
	public UserList(String[] name) {
		super();
		this.name = name;
		this.index=0;
	}
	
	@Override
	public boolean hasNext() {
		return(this.index<this.name.length)?true:false;
	}
	@Override
	public String next() {
		if (this.hasNext()) {
			return name[index++];
		}
		return null;
		
	}
}
