package com.capg.com;
 class Student1 {
	 private int rno;
	 private String name;
	  
	 public Student1(int rno,String name) {
		 this.rno=rno;
		 this.name=name;
	 }

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [rno=" + rno + ", name=" + name + "]";
	}
	
	 
 }

