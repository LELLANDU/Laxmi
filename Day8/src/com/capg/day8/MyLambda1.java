package com.capg.day8;

interface EvenOdd{
	void check(int a) ;
		
	}
interface PositiveNegative{
	void check(int num);
}
interface ToUpper{
	void check(String Name);
}

public class MyLambda1 {

	public static void main(String[] args) {
		EvenOdd evenOdd=(int a)->{
			if(a%2==0) 
				System.out.println("number "+a+" is even");
			
			else
				System.out.println("number "+a+" is odd");
			};		
		
		evenOdd.check(13);
		
		PositiveNegative positiveNegative=(int num)->{
			if(num<0)
				System.out.println("Number " +num+ " is Negative");
			else
				System.out.println("Number " +num+" is Postive");
		};
		
		positiveNegative.check(5);
		
		
		ToUpper upper=(String Name)->{
			System.out.println("String in Upper Case Is : "
		                         +Name.toUpperCase());
			
		};
		
		upper.check("Laxmi");
		}
	    	
	}
