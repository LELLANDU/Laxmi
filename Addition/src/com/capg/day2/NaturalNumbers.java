package com.capg.day2;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n Numbers:");
		n=sc.nextInt();
		while(i<=n) {
			sum=sum+i;
	        i++;
		}
		System.out.println(sum);
			
		
	}

}
