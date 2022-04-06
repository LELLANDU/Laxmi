package com.capg.day2;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers:" );
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		if(num1==num2 && num2==num3)
			System.out.println("all numbers are equal");
		else if(num1>num2 && num1>num3)
			System.out.println(num1 + "is Largest");
		else if(num2>num3)
			System.out.println(num2+ "is Largest");
		else
			System.out.println(num3 + "is Largest");
	}

}
