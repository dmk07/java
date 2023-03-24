package com.finalinfo;

public  class FinalVariableDeclaration {
	
	// once values assigned it can't be changed


		final  int b=20;
		final static int c=30;
	
	
	public static void main(String[] args) {
		
		final int a=10;
		
		System.out.print(a);  //10;
		
		FinalVariableDeclaration obj=new
				FinalVariableDeclaration();
		
		{
			System.out.print(obj.b); //20 instance var by obj
			
		}
		

		System.out.print(FinalVariableDeclaration.c); // static var by class name
		

	}

}
