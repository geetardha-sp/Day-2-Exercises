package com.sechpoint;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> arrayList= new ArrayList<String>();
		
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		arrayList.add("Five");
		
		System.out.println("Array list: " + arrayList);
		
		arrayList.trimToSize();
		
		System.out.println("Array list after Trim: " + arrayList);
	}
}
