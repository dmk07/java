package com.arrays;

import java.lang.reflect.Array;

public class CopyStringArray {

	public static void main(String[] args) {
		
		
		String[] str1 = { "dipak", "mahesh", "supriya", "ketki", "pooja", "sravani" };

		String[] str2=new String[10];

		
		str2=str1.clone();
		
		
		for(int i=0; i<str2.length; i++)
		{
		System.out.print(str2[i]+":");
		}
		
	}

}
