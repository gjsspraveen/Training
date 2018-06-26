package com.mav.logic;

import com.mav.repo.Prodt;
import com.mav.repo.Repo;

public class prodlogic {
	//Method

		public boolean details(Prodt prodmodelobj){
			System.out.println(prodmodelobj.getProductid());
			if ( prodmodelobj.getProductid().equalsIgnoreCase("Productid"))
			{
				return true;						
			}
			else 			
				return false;		
		}	
	}