package com.constructor;

public class DefaultConstructor {
	
	DefaultConstructor()
	{
		System.out.print("Default Constructor");
	}
	//hello
	
	// private constructor
	
	private DefaultConstructor(int a)
	{
		System.out.print("private constructor"+a);
	}
	
	
	
	
	public static void main(String[] args) {
	
		new DefaultConstructor(5);
		

	}

}
