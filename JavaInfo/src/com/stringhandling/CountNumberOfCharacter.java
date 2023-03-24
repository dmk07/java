package com.stringhandling;

public class CountNumberOfCharacter {

	public static void main(String[] args) {
	
		String str="Hello Java,I am Dipak";
		int count =0;
		for(int i=0; i<str.length(); i++)
		{
			
			if(str.charAt(i)!=' ')
			{
				count++;
			}
			
			
		}
		
		System.out.print(count);
	}

}
