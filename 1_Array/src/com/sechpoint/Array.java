package com.sechpoint;

import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<String>();
		
		elements.add("Red");
		elements.add("Green");
		elements.add("Orange");
		elements.add("White");
		elements.add("Black");
		
		System.out.println(elements);
		
		elements.set(2, "Yellow");
		
	  	System.out.println(elements);
	}
}
