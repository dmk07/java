package com.wrapperclass;

public class PrimitiveToWrapperClass {

	public static void main(String[] args) {
	
		// autoboxing
		
		int a=20;
		
			Integer i=Integer.valueOf(a);  //converting explicitly.
			
			Integer aa=a;
		
			System.out.print(i+" "+aa);
			
			// unboxing
			
			Integer c=new Integer(1);
			
			int j=c;
		

	}

}
