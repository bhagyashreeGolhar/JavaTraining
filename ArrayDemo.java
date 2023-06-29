package com;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		//int arr1[]= {10,20,30,abc};  // it's not allowed becoz array is homoginus in nature allows same kind of values
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		System.out.println("****************************************");
		
		for(int x:arr)
		{
			System.out.println(x);
		}
		
		
		//System.out.println("****************************************");
		
		int[] arr1=new int[5];  //size is fixed we can't extend it once defined
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		arr1[3]=40;
		arr1[4]=50;
		//arr1[5]=60; //not allowed as we have defined size as 5;
		
		
		System.out.println("****************************************");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
