package com.capg.day3;


	import java.io.IOError;
	import java.io.IOException;
	import java.util.Scanner;
	
	class OnlyEvenNumberAllowed extends Exception
	{
	    OnlyEvenNumberAllowed(String msg)
	    {
	        super(msg);
	    }
	}

	 

	public class MyException {

	 

	    public static void main(String[] args) throws OnlyEvenNumberAllowed {
	        
	        //Only accept positive number
	          
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a even number:");
	        int num=sc.nextInt();
	        if(num%2==0)
	        {
	            System.out.println(num);
	        }
	        else
	        {
	           //throw new OnlyEvenNumberAllowed("Only Even Number");
	           System.out.println("enter only Even nummber");    
	        }
	        
	    }
	}

	


