package com.capg.day8;

import java.util.ArrayList;

import java.util.stream.Stream;

public class MyStream {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(34);
		list.add(46);
		list.add(9);
		
		Stream<Integer>st=list.stream();
		//list.stream().forEach(System.out::println);
		list.stream().filter(e->e%2==0).forEach(System.out::println);
		
	
				
				
		

	}

}
