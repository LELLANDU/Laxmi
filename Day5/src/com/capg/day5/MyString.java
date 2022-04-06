package com.capg.day5;

public class MyString {
	
	 public static void main(String[] args) {
	        // it will store the string in string pool constant
	        String str = "Hello"; // 10001
	        // we are creating the object of string
	        String str1 = new String("Hello");
	        
	        String str2="Hello";
	        
	        if (str.equalsIgnoreCase(str1))
	        // it will compare thr value and datatype also
	        {
	            System.out.println("true");
	        } else {
	            System.out.println("flase");
	        }
	        
	        //learn method of string
	         String one="A"; //65 A is smaller 
	         String two="A"; //66  b is bigger one
	                       // 65-66=-1
	         //CompareTo
	         //it will give zero if both are equal
	        //if first one is greater than second +positive number
	    //if second is greater than first then - Negative number

	 

	         
	         System.out.println(one.compareTo(two));
	        
	         //it will return the char at given index
	         str.charAt(0);
	        //it will take the index and return the char   
	         System.out.println(str.charAt(0));
	         //combine two string using concat
	         System.out.println(str.concat(str2));
	           
	         //it will search for string is contained in given string
	         System.out.println(str.contains("Bell"));
	         
	         //convert the string to byte array
	         byte[] b=str.getBytes();
	         //it will take the char and return the index
	         System.out.println(str.indexOf("e"));

	 

	         //if this is empty it will return true
	         //it will return false
	         String str4="";
	         System.out.println(str4.isBlank());
	         
	         //str.lastIndexOf(0);
	        System.out.println(str.length());
	        
	        //it will take the new and old char and replace with new value
	        str.replace("H", "J");
	        System.out.println(str.replace("H", "J"));
	        //01234
	    // Returns a character sequence
	    //str.substring(begin, end)    
	         //str.subSequence(begin, end)

	 

	        //Hello hello more 
	        //char between these two length
	         System.out.println(str.subSequence(0, 3));
	         
	      
	         
	         System.out.println(str.toUpperCase());
	         
	         System.out.println(str.toLowerCase());
	         
	         //it will remove the space from front and back of string
	         String str6 =" hello   java       ";
	         System.out.println(str6.trim());
	         System.out.println(str6);
	         //012  34     
	         //Hel  lo
	         System.out.println(str.subSequence(0, 3));
	         
	    }

}
