package com.capg.day6;
class Employee<A,B,C>{
	A id;
	B name;
	C salary;
	
	public Employee(A id,B name,C salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class MyGeneric {

	public static void main(String[] args) {
		Employee<Integer,String,Integer> e1=new Employee<Integer,String,Integer>(1001,"abc",10);
		System.out.println(e1);

	}

}
