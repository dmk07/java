package com.staticinfo;

public class StaticBlockByVar {

	
	static int a=m1(); // ned to create method static return type int
	
		public  static int m1()
		{
			System.out.print("static method");
			return 20;
		}
	
	
	public static void main(String[] args) {
	
	System.out.print(a);
		

	}

}
