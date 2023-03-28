package com.blocks;

public class InstanceBlockInsideStaticBlock {

	static {  // inside static block having instance block is execuated without obj creation
		
		{
			System.out.print("block 1");
			
		}

		{
			System.out.print("block 2");
		}
		
		
	}
	
	public static void main(String[] args) {
	
	
		
		
		

	}

}
