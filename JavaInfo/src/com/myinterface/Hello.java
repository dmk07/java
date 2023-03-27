package com.myinterface;

public class Hello implements ImplementMe {

	@Override
	public void hello() {
		
		System.out.print("Hello");
		

	}

	public static void main(String[] args) {
	
		new Hello().hello();

	}

}
