package com.blocks;

public class InstanceBlock {

	{
		// instance initilizer block. you can call only if an object of class created.
		System.out.print("hello Dipak");
	}
	static {
		// static block don't need to create obj of class. when ever class is loaded in jvm it automaticlly call static block
		System.out.print(12+4334);
	}
	
	
	public static void main(String[] args) {
		
		InstanceBlock b=new InstanceBlock();
	
	}

}
