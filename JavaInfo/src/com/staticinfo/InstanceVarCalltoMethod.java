package com.staticinfo;

public class InstanceVarCalltoMethod {

	
	int a=m1();   //defaule values of int 0
	
	public int m1()
	{
		System.out.print(" "+a);
		a=a+45;
		return a;
	}
	
	
	
	public static void main(String[] args) {
	
		System.out.print("main :");
		new InstanceVarCalltoMethod().m1();
		
		// first print main after call m1 method it will print default value of int var .
		
	}

}
