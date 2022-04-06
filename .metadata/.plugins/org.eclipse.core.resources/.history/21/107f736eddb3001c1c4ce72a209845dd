package com.capg.day7;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Collection;



public class MyMap1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();
		
		map.put(1001, "Laxmi");
		map.put(1002, "Pooja");
		map.put(1003, "Kalpana");
		
		System.out.println(map.get(1003));
		
		Set<Integer> keys=map.keySet();
		for(Integer key:keys) {
			System.out.println("key " + key +" value "+ map.get(key));
			
			map.clear();
			
			System.out.println(map.contains("Laxmi"));
			
			System.out.println(map.containsValue("Laxmi"));
			
			Set<Map.Entry<Integer,String>> Key=map.entrySet();
			for(Map.Entry<Integer,String> m:Key) {
				System.out.println(m.getKey()+"value is"+m.getValue());
			}
			
			
		}
		

	}

}
