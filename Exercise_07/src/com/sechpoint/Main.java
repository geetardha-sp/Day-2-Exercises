package com.sechpoint;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Customer, Integer> hashMap = new HashMap<Customer, Integer>();
		
		Customer customer_1 = new Customer(1, "One", "11111");
		Customer customer_2 = new Customer(2, "Two", "22222");
		Customer customer_3 = new Customer(3, "Three", "33333");
		
		hashMap.put(customer_1, 4670);
		hashMap.put(customer_2, 8740);
		hashMap.put(customer_3, 7455);
		
		System.out.println(hashMap.get(customer_1));
		System.out.println(hashMap.get(customer_2));
		System.out.println(hashMap.get(customer_3));
	}
}
