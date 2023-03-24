package com.methods;

public class InstanceMethodDeclaration {

	// instance method with no return type
	public void hello()
	{
		System.out.println("hello,Dipak");
	}
	
	// static method with int return type
	public static int bye()
	{
		System.out.println("Bye,Dipak");
		return 0;
	}
	
	public static void main(String[] args) {
		
		// create obje
		InstanceMethodDeclaration obj=new InstanceMethodDeclaration();
		
		// calling instance method
		obj.hello();
		// calling static method
		obj.bye();
		InstanceMethodDeclaration.bye();
		
		

	}

}
