package com.mav.fblogic;

import com.mav.model.FModel;
import com.mav.database.AddFlightDB;

public class Fblogic {

	public boolean log (FModel fbl)
	{
		boolean g;
		if (fbl.getAname().equals("boeing"))
		{
			//g =true;
			g=true;
			AddFlightDB FDAO = new AddFlightDB();
			FDAO.addFlightToDB(fbl);
		}
		else 
		{
			g = false;			
		}
		return g;
					
	}
	
}

