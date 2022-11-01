package com.sechpoint;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<Employee>(new EmployeeComparator());

		treeSet.add(new Employee(2, "Two", "two@mail.com"));
		treeSet.add(new Employee(4, "Four", "four@mail.com"));
		treeSet.add(new Employee(1, "One", "one@mail.com"));
		treeSet.add(new Employee(5, "Five", "five@mail.com"));
		treeSet.add(new Employee(3, "Three", "three@mail.com"));

		System.out.println("Original tree set: " + treeSet);
		
		TreeSet<Employee> treeSetReverse = (TreeSet<Employee>) treeSet.descendingSet();
		
		System.out.println("Reverse tree set: " + treeSetReverse);
	}
}
