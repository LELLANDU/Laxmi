package com.capg.day3;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;
	//Class can be converted to exception class by extending the Exception class
	class OnlyPositiveNumberAllowed extends Exception
	{
	    OnlyPositiveNumberAllowed(String msg)
	    {
	        super(msg);
	    }
	}

	 

	public class MyCustomException {

	 

	    public static void main(String[] args) throws OnlyPositiveNumberAllowed {
	        
	        //Only accept positive number
	          
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num=sc.nextInt();
	        if(num>0)
	        {
	            System.out.println(num);
	        }
	        else
	        {
	         throw new OnlyPositiveNumberAllowed("Only Positive Number");
	        //System.out.println("enter only positive nummber");    
	        }
	        
	}
}
