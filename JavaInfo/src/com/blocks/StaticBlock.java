package com.blocks;

public class StaticBlock {

	static {
		System.out.print("Static block is loaded and execute before main");
	}
	
	
	public static void main(String[] args) {

		System.out.print("main method");
		
		
	}

}
