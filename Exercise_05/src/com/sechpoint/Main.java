package com.sechpoint;

import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(10, "Ten");
		treeMap.put(60, "Sixty");
		treeMap.put(40, "Forty");
		treeMap.put(50, "Fifty");
		treeMap.put(20, "Twenty");
		
		System.out.println("Tree Map: " + treeMap);
		System.out.println("Greatest Key: " + treeMap.pollLastEntry());
		System.out.println("Tree Map: " + treeMap);
	}
}
