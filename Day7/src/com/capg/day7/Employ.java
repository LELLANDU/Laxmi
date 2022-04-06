package com.capg.day7;

class Person
{
	 int empid;
	 String ename;
	 double sal;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
public class Employ{
	public static void main(String[] args) {
		Person p=new Person();
		 
		p.setEmpid(4001);
		p.setEname("Laxmi");
		p.setSal(35000);
		
		System.out.println(p.getEmpid());
		System.out.println(p.getEname());
		System.out.println(p.getSal());
		

	}

}

