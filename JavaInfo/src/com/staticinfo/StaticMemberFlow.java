package com.staticinfo;

public class StaticMemberFlow {

	static int hello=m1();
	
	
	public  static int m1(){
		System.out.print("hello");
		
		return 0;
	}
	
	static {
		System.out.print("hello static");
	}
	
	
	public static void main(String[] args) {
		
		System.out.print(hello);

	}

}
