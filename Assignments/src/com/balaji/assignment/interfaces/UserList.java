package com.balaji.assignment.interfaces;

public class UserList implements MyIterator{
	 private String[] name;
	 private int index;

	
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
