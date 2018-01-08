package com.balaji.assignment.Collection;

public class Member implements Comparable<Member>{
	private String memberId;
    private String name;
    private String city;
    private String country;

    /**
     * 
     * @param memberId
     * @param name
     * @param city
     * @param country
     */
    public Member(String memberId, String name, String city, String country) {
        this.memberId = memberId;
        this.name = name;
        this.city = city;
        this.country = country;
    }
    /**
     * 
     * @return
     */
    public String getMemberId() {
        return memberId;
    }
    /**
     * 
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @return
     */
    public String getCity() {
        return city;
    }
    /**
     * 
     * @return
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
