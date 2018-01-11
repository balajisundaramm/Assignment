package com.balaji.assignment.Collection.member;
/**
 * 
 * @author spaneos
 *
 */
public class Member implements Comparable<Member>{
	private String memberId;
    private String name;
    private String city;
    private String country;

    /**
     * Parameterized Constructor
     * @param memberId Member id
     * @param name Name of the Member
     * @param city City where member lives
     * @param country Member's country
     */
    public Member(String memberId, String name, String city, String country) {
        this.memberId = memberId;
        this.name = name;
        this.city = city;
        this.country = country;
    }
    /**
     * 
     * @return Member's id
     */
    public String getMemberId() {
        return memberId;
    }
    /**
     * 
     * @return Member's name
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @return Members's city
     */
    public String getCity() {
        return city;
    }
    /**
     * 
     * @return Member's country
     */
    public String getCountry() {
        return country;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}
	
	@Override
	public int compareTo(Member o) {
		return (this.getName().compareToIgnoreCase(o.getName()));
	}
    
}
