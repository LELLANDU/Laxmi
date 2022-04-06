package com.capg.day8;

import java.util.ArrayList;
import java.util.Collections;

public class MyStreamApi {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(1);
        list.add(-4);
        list.add(-8);
        list.stream().forEach(System.err::println); 
        list.stream()
                .filter(e -> e > 0) ;            
                //.map(num->num*2);
        for(Integer num:list)
        	System.out.println(num);
                //.sorted(Collections.reverseOrder())
                //.distinct()
                //.count();
       
       // list.forEach(System.out::println);


	}

}
