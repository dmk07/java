package com.arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = { 10, 32, 43, 23, 12, 22, 44, 43, 534, 3 };
		int[] arr2 = { 34, 12, 23, 44, 3, 234, 24, 22, 42, 22 };

		// find size of array

		System.out.print(arr1.length);
		System.out.print(arr2.length);
		
		
		System.out.println("");

		// compare two array

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				//find common elements
				if(arr1[i]==arr2[j])
				{
					System.out.print(","+arr1[i]);	
				}
				
			}

		}

	}

}
