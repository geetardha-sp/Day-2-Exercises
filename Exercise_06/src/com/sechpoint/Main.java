package com.sechpoint;

import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		     
		treeSet.add(126);
		treeSet.add(71);
		treeSet.add(82);
		treeSet.add(101);
		treeSet.add(59);
		treeSet.add(66);
		treeSet.add(124);
		treeSet.add(79);
		treeSet.add(96);
		treeSet.add(85);
		
		System.out.println("Tree set: " + treeSet);
		System.out.println("Removing the first(lowest) element: " + treeSet.pollFirst());
		System.out.println("Tree set after removing lowest element: " + treeSet);
	}
}
