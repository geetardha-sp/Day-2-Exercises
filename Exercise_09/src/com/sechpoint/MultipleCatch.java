package com.sechpoint;

public class MultipleCatch {
	public static void main(String[] args) {
		int array[] = {10,20,30,40};
		int num1 = 50;
		int num2 = 1;
		
		try {
			System.out.println(num1/num2);
			System.out.println("4th element of given array = " + array[3]);
			System.out.println("5th element of given array = " + array[4]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
