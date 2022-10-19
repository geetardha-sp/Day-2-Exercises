package com.sechpoint;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a real number: ");
			double number = scanner.nextDouble();
			
			System.out.println(Math.sqrt(number));
		}
		catch (Exception e) {
			System.out.println("Enter a real number!!!");
		}
	}
}
