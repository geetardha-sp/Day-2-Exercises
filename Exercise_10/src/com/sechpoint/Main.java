package com.sechpoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static <T> void swap(List<T> array, int i, int j) {
		Collections.swap(array, i, j);
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,34,67,46,6,5,6,67,66,76);
		List<String> strings = Arrays.asList("one", "two", "nine", "eight", "three");

		swap(integers, 8, 7);
		System.out.println(integers);
		
		swap(strings, 2, 4);
		System.out.println(strings);
	}
}
