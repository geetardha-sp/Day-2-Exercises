package com.sechpoint;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<String>();
		
		elements.add("One");
		elements.add("Two");
		elements.add("3");
		elements.add("Four");
		elements.add("Five");
		
		System.out.println(elements);
		
		elements.set(2, "Three");
		
	  	System.out.println(elements);
	}
}
