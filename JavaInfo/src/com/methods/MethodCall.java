package com.methods;

public class MethodCall {
	


	public void findelement(Hello hello)
	{
		System.out.print(hello);
	}
	

	
	
	public static void main(String[] args) {
		MethodCall obj=new MethodCall();
		obj.findelement(new Hello());

	}

}
