package com.arrays;



public class StringArrayDeclaration {

	public static void main(String[] args) {

		// string array

		String[] str1 = { "dipak", "mahesh", "supriya", "ketki", "pooja", "sravani" };
		String[] str2 = { "supriya", "pooja", "janki", "madhura", "apoorva", "sayali", "dipak" };

		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				
				// comparing two string array
				if (str1[i].equals(str2[j])) {
					System.out.print(str1[i]);
				}

			}

		}

	}

}
