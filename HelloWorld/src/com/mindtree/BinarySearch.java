package com.mindtree;

public class BinarySearch {
	public static int binarySearch(int a[],int first,int last,int s)
	{
		if(last<first)
		{
			int mid=first+(last-first)/2;
			if(a[mid]==s)
			{
				return mid;
			}
			if(a[mid]>s)
			{
				return binarySearch(a,first,mid-1,s);
			}
			else
			{
				return binarySearch(a,mid+1,last,s);
			}
		}
		return-1;

		
	}

	public static void main(String[] args) {
		int a[]= {1,4,3,5,2};
		int s=8;
		int last=a.length-1;
		int result=binarySearch(a,0,last,s);
		if(result==1)
		{
			System.out.println(s+"element not found");
		}
		else
			System.out.println(s+"index is"+result);

	}

}
