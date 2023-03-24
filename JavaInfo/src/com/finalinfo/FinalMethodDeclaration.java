package com.finalinfo;

public class FinalMethodDeclaration {
	
	// once method is declared final then it can't be override by other classes

	public final static void finalMethod()
	{
		System.out.print("final method this method can't be override");
		
	}
	
	
	public static void main(String[] args) {

		

		FinalMethodDeclaration.finalMethod();
		
		

	}

}
