package com.balaji.assignment.Collection;
/**
 * 
 * @author spaneos
 *
 */
public class Player {
	private String name, email, city, state;
	private int age;
	/**
	 * Parameterized Constructor
	 * @param name Player's name
	 * @param email Player's email
	 * @param city Player's city
	 * @param state Player's state
	 * @param age Player's age
	 */
	public Player(String name, String email, String city, String state, int age) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.state = state;
		this.age = age;
	}
	/**
	 * 
	 * @return the name of the player
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name Player's name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return Player's email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email Player's email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 *  
	 * @return Player's city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 
	 * @param city Player's city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 
	 * @return Player's state
	 */
	public String getState() {
		return state;
	}
	/**
	 * 
	 * @param state Player's state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 
	 * @return Player's age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 
	 * @param age Player's age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", email=" + email + ", city=" + city + ", state=" + state + ", age=" + age
				+ "]";
	}
	
	
}
