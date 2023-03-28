package com.blocks;

public class MultipleStaticBlocks {

	// order of static block execution
	static {
		System.out.println("static block 1");
	}
	
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}
	static {
		System.out.println("static block 4");
	}
	
	static {
		System.out.println("static block 5");
	}
	
	public static void main(String[] args) {

	}

}
