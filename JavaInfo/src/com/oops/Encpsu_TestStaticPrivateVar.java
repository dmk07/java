package com.oops;

public class Encpsu_TestStaticPrivateVar {

	public static void main(String[] args) {
		
		Encpsu_static_pr_variable.setStudName("Dipak Kadam");
		Encpsu_static_pr_variable.setStudCity("Pune");
		
		
		Encpsu_static_pr_variable stud=new Encpsu_static_pr_variable();
		
		
		
		System.out.print(stud.getStudCity());  // values by getting obj 
		System.out.print(stud.getStudName());
		
		System.out.print(Encpsu_static_pr_variable.getStudName()); // values getting by class name
		System.out.print(Encpsu_static_pr_variable.getStudCity());
		

	}

}
