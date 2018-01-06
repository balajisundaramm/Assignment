package com.balaji.assignment.Collection;

/**
 * Created by Balaji on 6/1/18.
 */
public class Member {
    private String memberId;
    private String name;
    private String city;
    private String country;


    public Member(String memberId, String name, String city, String country) {
        this.memberId = memberId;
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }


}
