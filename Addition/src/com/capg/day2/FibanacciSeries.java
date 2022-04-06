package com.capg.day2;

import java.util.Scanner;

public class FibanacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,a=0,b=1,i=1,c,sum = 0;
		System.out.println("Enter n value:");
		n=sc.nextInt();
		while(i<=n)
		{
			System.out.println(a);
				
			sum=sum+a;
			c=a+b;
			a=b;
			b=c;
			i++;
						
		}
		
		System.out.println(sum);
	
	}

}
