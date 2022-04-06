package com.capg.day7;

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
	}
	
}

public class MyThreadInterface {

	public static void main(String[] args) {
		Thread t=new Thread();
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.run();
		t2.run();
		

	}

}
