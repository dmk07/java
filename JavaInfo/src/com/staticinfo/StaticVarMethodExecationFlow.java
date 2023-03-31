package com.staticinfo;

public class StaticVarMethodExecationFlow {

	
	static int a=m1(); // static method is call first mentioned first
	static int b=m1();
	
	
	public static int m1()
	{
		System.out.print("m1");
		return 10;
	}
	
		static {
			
			System.out.print("static block");
			
		}
	
	public static void main(String[] args) {
	
		
		System.out.print("main block");
		

	}

}
