package com.oops;

public class TestEncapsulation {

	public static void main(String[] args) {

		Encapsulation stud=new Encapsulation();
		
		stud.setStudName("Dipak");
		
		String name=stud.getStudName();
		stud.setStudCity("PUNE");
		String city=stud.getStudCity();
		
		System.out.print(name+"  "+city);
		
	}

}
