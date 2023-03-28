package com.blocks;

public class InstanceBlockInStaticBlock {

	

	static{
		int a=10;
		int b=20;
		
		{
			int c;
			System.out.print(c=a+b);
		}
		
		{
			System.out.print(a-b);
		}
	}
	
	
	public static void main(String[] args) {
		

	}

}
