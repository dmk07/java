package com.oops;

public class Encapsulation {
/*Encapsulation is a way of hiding the implementation details of a class from outside 
 * access and only exposing a public interface that can be used to interact with the class.

In Java, encapsulation is achieved by declaring the instance variables of a class 
as private, which means they can only be accessed within the class. 
To allow outside access to the instance variables, public methods called 
getters and setters are defined, which are used to retrieve and 
modify the values of the instance variables, respectively. 
By using getters and setters, the class can enforce its own data validation rules 
and ensure that its internal state remains consistent.

*/
	private String studName;
	private String studCity;
	

	public String getStudCity() {
		return studCity;
	}


	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


}
