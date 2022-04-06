package com.laxmi;

import java.util.Scanner;

//Palindrome in string

public class app {

	public static void main(String[] args) {
		// check the given string is palindrome
		Scanner s=new Scanner(System.in);
		String name1,name2 = " ";
		System.out.println("enter a string:");
		name1=s.nextLine();
		
		//reversing the string
		for(int i=name1.length()-1;i>=0;i--) {
			name2+=name1.charAt(i);
		}
		//System.out.println(name2);
		if(name1.equals(name2))
		System.out.println("palindrome");
		else
		System.out.println("not a palindrome");
	}
}
