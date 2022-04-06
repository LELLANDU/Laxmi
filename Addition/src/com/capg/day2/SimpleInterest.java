package com.capg.day2;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p,r,SI;
		int t;
		System.out.println("Enter principle:");
		p=sc.nextDouble();
		System.out.println("Enter rate of interest:");
		r=sc.nextDouble();
		System.out.println("Enter Time:");
		t=sc.nextInt();
		
		SI=(p*t*r)/100;
		System.out.println(SI);
		

	}

}
