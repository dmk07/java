package com.staticinfo;

public class StaticVarMethodExecution {

	
	static int a=m1();
							// stackoverflowerror
	public static int  m1()
	{
		
		a=10;
		System.out.print(StaticVarMethodExecution.m1());
		if(a==20) {System.exit(0);}
		return a;
	}
	
	
	
	
	public static void main(String[] args) {
		
		

	}

}
