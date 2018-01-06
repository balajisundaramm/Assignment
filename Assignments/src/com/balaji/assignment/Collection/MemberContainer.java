package com.balaji.assignment.Collection;

import com.balaji.assignment.utill.UserInputValidations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Balaji on 6/1/18.
 */
public class MemberContainer {
    List<Member> list=null;

    public void addMember(){
        System.out.println("Enter the name");
        String name= UserInputValidations.validateString();
        System.out.println("Enter the city");
        String city=UserInputValidations.validateString();
        System.out.println("Enter the country");
        String country=UserInputValidations.validateString();
        String mid=MemberIdGenerator.getMemberId();
        Member member=new Member(name,city,country,mid);
        if(list==null) {
            list = new LinkedList<Member>();
        }
        list.add(member);
        System.out.println("Member has been added successfully!!!");
    }

    public void deleteMember(String mid){
        Member member=new MemberContainer().serachById(mid);
        if (member!=null){
            list.remove(member);
            System.out.println("Member has been removed successfully!!!");
        }
        else {
            System.out.println("Sorry, No matches found.");
        }
    }

    public Member serachById(String mid) {
        Member member = null;
        for (Member member1 : list) {
            if (mid.equals(member1.getMemberId())) {
                member = member1;
                break;
            }
        }
        return member;
    }

    public Member searchByName(String name){
        Member member=null;
        for (Member member1:list) {
            if (name.equals(member1.getName())){
                member=member1;
                break;
            }
        }
        return member;
    }

    /*public List<Member> displaySortingOrder(String order){
        if (order.equalsIgnoreCase("desc"))

    }*/
}
