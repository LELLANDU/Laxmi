package com.soumya;
import java.util.*;
public class DinnerTogether {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the day interval of sam");
    int sam=sc.nextInt();
    System.out.println("Enter the day interval of Riya");
    int riya=sc.nextInt();
    if(riya>0 && sam>0)
    {
    	int lcm=sam*riya/GCD(sam,riya);
    	System.out.println("Sam and Riya will have their dinner on day "+lcm);
    }
    else
    {
    	System.out.println("Given Interval is not valid");
    	return;
    
    
	}
	}
	public static int GCD(int sam,int riya) {
		if(sam==0)
			return riya;
		else if(riya==0 ||sam==riya)
			return sam;
		else if(sam>riya)
			return GCD(sam-riya,riya);
		else
		return GCD(sam,riya-sam);
	

}
}