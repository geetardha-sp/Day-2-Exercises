package com.sechpoint;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<Employee>(new EmployeeComparator());
		
		treeSet.add(new Employee(2, "Two", "two@mail.com"));
		treeSet.add(new Employee(4, "Four", "four@mail.com"));
		treeSet.add(new Employee(1, "One", "one@mail.com"));
		treeSet.add(new Employee(5, "Five", "five@mail.com"));
		treeSet.add(new Employee(3, "Three", "three@mail.com"));
		
		System.out.println("Original tree set:" + treeSet);
		
		Iterator<Employee> itr = treeSet.descendingIterator();

		System.out.println("Elements in Reverse Order:");
	    while (itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}
}
