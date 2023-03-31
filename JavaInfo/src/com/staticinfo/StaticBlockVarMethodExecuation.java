package com.staticinfo;

public class StaticBlockVarMethodExecuation {

	 int a=m1(); // instance var  is call when object created.
	 int b=m1();
	
	
	public static int m1()
	{
		System.out.println("m1");
		return 10;
	}
	
		static {
			
			System.out.println("static block");
			
		}
	
	public static void main(String[] args) {
	
		
		System.out.println("main block");
		
		StaticBlockVarMethodExecuation t=new StaticBlockVarMethodExecuation();
		
		System.out.print(t.a);

	}
}
