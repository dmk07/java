package com.localvar;

public class LocalVariable {

	public void m1(int aa) // No error until you call m1 method and print it.
	{
		int a=aa; //primitive  local type variable
		
		System.out.println(a); // local variable should be intilized.
		
		
	}
	
	public void m2(Address address)
	{
		Address addr=address;
		System.out.println(addr.cityName); // reference variable should be intilized
		System.out.println(addr.homeNumber); // reference variable should be intilized
		System.out.println(addr.streetName); // reference variable should be intilized
		
	}

	
	
	
	public static void main(String[] args) {
		
		LocalVariable local=new LocalVariable();
		local.m1(10);
		Address addr=new Address();
		addr.homeNumber="1010";
		addr.cityName="PUne";
		addr.streetName="Chatrapati road";
		local.m2(addr);
		
	}

}
