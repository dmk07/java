package com.blocks;

public class NestedInstanceBlock {

	{
		int a=10;
		int b=20;
		
		{
			int c=50;
			System.out.print(a+b);
			{
				System.out.print(c+a+b);
			}
		}
	
	
	}
	
	
	
	
	public static void main(String[] args) {
	
		new NestedInstanceBlock();

	}

}
