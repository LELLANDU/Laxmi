package com.capg.day2;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int k=1;
		do {
			System.out.println(k);
			k=k+1;
		}
		while(k<=n);
		}

}
