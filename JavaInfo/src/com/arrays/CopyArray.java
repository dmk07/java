package com.arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] arr1 = { 10, 32, 43, 23, 12, 22, 44, 43, 534, 3 };
		
		
		int[] arr2=new int[10];
		
		
		for(int i=0; i<arr1.length; i++)
		{
			
			arr2[i]=arr1[i]; // copy one by one
			
		}
		
		for(int i=0;i<arr2.length; i++)
		{
		System.out.println(arr2[i]+":"+arr1[i]);
		}
		
		
		
		
		
	}

}
