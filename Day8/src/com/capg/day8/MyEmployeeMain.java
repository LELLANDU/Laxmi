package com.capg.day8;

import java.util.ArrayList;

public class MyEmployeeMain {

	public static void main(String[] args) {
		ArrayList<MyEmployee>ls=new ArrayList<MyEmployee>();
		ls.add(new MyEmployee(1001,"pooja",1000));
		ls.add(new MyEmployee(1001,"Kalpana",2000));
		ls.add(new MyEmployee(1001,"Laxmi",4000));
		ls.add(new MyEmployee(1001,"Lucky",5000));
		
		ls.stream().forEach(e->System.out.println(ls));
		
		//ls.stream().filter(e->e.getSalary>2000).forEach(e->System.out.println(e));
		
		//ls.stream().map(e->e.getSalary()).forEach(e->System.out.println(e));
		
		
		


	}

}
