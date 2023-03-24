package com.finalinfo;

public final class FinalClassDeclaration {
	
	// once declared class as a final other classes can't extends final class
		public void hello()
		{
			System.out.print("Hello final class");
		}
	
	
	public static void main(String[] args) {
	
		// final class can't be extended by other classes
		
		FinalClassDeclaration f=new FinalClassDeclaration();
		f.hello();
		
		
		
	}

}
