package com.blocks;

public class AddByStaticBlock {

	// addition by static block
	 static {
		 int a=10;
		 int b=20;
		 System.out.print(a+b);
	 }
	 
	 // addition by instace block
	 {
		 int a=10;
		 int b=20;
		 System.out.print(a+b);
	 }
	
	
	public static void main(String[] args) {
		
		new AddByStaticBlock();
		
		
	}

}
