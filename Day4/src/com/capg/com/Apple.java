package com.capg.com;

interface Calling
{
	void calling();
}
interface SMS
{
	void sms();
}
class Mobile implements Calling,SMS
{

	@Override
	public void sms() {
		System.out.println("sms from apple");
		
		
	}

	@Override
	public void calling() {
		System.out.println("calling from mobile");
		
	}
}

public class Apple {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.calling();
		m.sms();
	}

}
