/**
 * 
 */
package com.balaji.assignment.Collection.SortingOrders;

import java.util.Comparator;

import com.balaji.assignment.Collection.Member;

/**
 * @author spaneos
 *
 */
public class DescendingOrderSorting implements Comparator<Member>{

	@Override
	public int compare(Member o1, Member o2) {
		return -(o1.compareTo(o2));
	}
}
