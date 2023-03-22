package com.arrays;

public class PrintArray {

	public static void main(String[] args) {
	
		// Array declaration
		int[] array= {120,3442,2134,343,23433,342,4,23,3435};
		
		// print array
		 
		for(int i=0; i<array.length; i++)   // should not use <= 
		{
			
			System.out.println(array[i]);
			
		}
		
		// desc order
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				
				if(array[i]< array[j])    // desc <
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
				
			}

			
		}
		System.out.println("Sorting Array");
		
		for(int i=0; i<array.length; i++)   // should not use <= 
		{
			
			System.out.print(","+array[i]);
			
		}
		
		
		// asceding order
		
				for(int i=0; i<array.length; i++)
				{
					for(int j=i+1; j<array.length; j++)
					{
						
						if(array[i]> array[j])   // asceding >
						{
							int temp=array[i];
							array[i]=array[j];
							array[j]=temp;
						}
						
						
					}

					
				}
				System.out.println("Sorting Array");
				
				for(int i=0; i<array.length; i++)   // should not use <=
				{
					
					System.out.print(","+array[i]);
					
				}
				
		
		
		
		
		
		

	}

}
