package com.mav.logic;

import com.mav.repo.Repo;

public class Logic {
	//Method

	public boolean details(Repo modelobj){
		System.out.println(modelobj.getDeptcode());
		if ( modelobj.getDeptcode().equalsIgnoreCase("Admin"))		
		{
			return true;						
		}
		else 			
			return false;		
	}	
}
