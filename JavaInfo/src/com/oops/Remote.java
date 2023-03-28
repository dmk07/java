package com.oops;

public class Remote {
	boolean tvStatus;
	Remote()
	{
	tvStatus=false;	
	}
	
	public void changeStatus()
	{
		
		System.out.print(new Remote().tvStatus);
		
		if(tvStatus==true)
			System.out.print("TV is ON");
		else
			System.out.print("TV is OFF");
		tvStatus=!tvStatus;
	}

}
