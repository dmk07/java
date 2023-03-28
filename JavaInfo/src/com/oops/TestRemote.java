package com.oops;

public class TestRemote {

	public static void main(String[] args) {
	
		
		Remote r=new Remote();
		r.changeStatus();  // off
		System.out.println("");
		r.changeStatus();  // on
		System.out.println("");
		r.changeStatus();  // off
	}

}
