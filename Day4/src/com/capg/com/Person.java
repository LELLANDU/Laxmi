package com.capg.com;

import java.util.ArrayList;
import java.util.List;

public class Person {

	public static void main(String[] args) {
		List<Student1>list=new ArrayList<Student1>();
		Student1 s1=new Student1(1001,"Laxmi");
	    Student1 s2=new Student1(1002,"Pooja");
		list.add(s1);
		list.add(s2);
		
		//System.out.println(s1);
		//System.out.println(s2);
		
		//System.out.println(list);
		
		for (Student1 s:list ) {
			System.out.println(s);
			
		}
		System.out.println(list.size());
	

	}

}
