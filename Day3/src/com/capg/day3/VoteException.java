package com.capg.day3;


	
	import java.io.IOError;
	import java.io.IOException;
	import java.util.Scanner;
	
	class NotEligibleException extends Exception
	{
		NotEligibleException(String msg)
	    {
	        super(msg);
	    }
	}

	 

	public class VoteException {

	 

	    public static void main(String[] args) throws NotEligibleException {
	        
	 
	          
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a age:");
	        int age=sc.nextInt();
	        if(age>18)
	        {
	            System.out.println("Eligible for vote");
	        }
	        else
	        {
	           //throw new NotEligibleException("Above 18 are eligible for vote");
	           System.out.println("above 18 are aligible for vote");    
	        }
	        
	    }
	}



