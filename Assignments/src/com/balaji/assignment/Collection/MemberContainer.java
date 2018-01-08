/**
 * 
 */
package com.balaji.assignment.Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.midi.Soundbank;

import com.balaji.assignment.Collection.SortingOrders.DescendingOrderSorting;
import com.balaji.assignment.utill.UserInputValidations;

/**
 * @author spaneos
 *
 */
public class MemberContainer {
	List<Member> list=null;
	/**
	 * This method is used to add member to the list
	 */
	public void addMember(){
		System.out.println("Enter the name");
		String name= UserInputValidations.validateString();
		System.out.println("Enter the city");
		String city=UserInputValidations.validateString();
		System.out.println("Enter the country");
		String country=UserInputValidations.validateString();
		String mid=MemberIdGenerator.getMemberId();
		Member member=new Member(mid,name,city,country);
		if(list==null) {
			list = new LinkedList<Member>();
		}
		list.add(member);
		System.out.println("Details of the member:");
		System.out.println(member);
		System.out.println("Member has been added successfully!!!");
	}
	/**
	 * This method is used to delete the member from the list
	 * @param member Input value-Member
	 */
	public void deleteMember(Member member){
		if (member!=null){
			list.remove(member);
			System.out.println("Member has been removed successfully!!!");
			System.out.println();
		}
		else {
			System.out.println("Sorry, No matches found.");
		}
	}
	/**
	 * Search the member from the list
	 * @param mid Input Value-Member ID
	 * @return Member
	 */
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
	/**
	 * 
	 * @param id Member ID
	 * @param name Member's name
	 * @return Member
	 */
	public Member searchByName(String id,String name){
		Member member=null;
		for (Member member1:list) {
			if (name.equals(member1.getName()) || (id.equals(member1.getMemberId()))){
				member=member1;
				break;
			}
		}
		return member;
	}
	/**
	 * 
	 * @param order Order of searching 
	 * @return Sorted Information
	 */
	public Set<Member> displaySortingOrder(String order){
		if(order.equalsIgnoreCase("aesc")) {
			Set<Member> sortedSet=new TreeSet<Member>();
			sortedSet.addAll(list);
			return sortedSet;
		}
		else if(order.equalsIgnoreCase("desc")) {
			Set<Member> sortedSet=new TreeSet<Member>(new DescendingOrderSorting());
			sortedSet.addAll(list);
			return sortedSet;
		}
		return null;
	}
}
