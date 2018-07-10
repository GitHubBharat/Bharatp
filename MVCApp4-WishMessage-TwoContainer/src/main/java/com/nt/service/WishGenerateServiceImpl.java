package com.nt.service;

import java.util.Calendar;

public class WishGenerateServiceImpl implements WishGenerateService {

	@Override
	public String generateWish(String user) {
		Calendar cal = null;
		int hour = 0;
		
		// create Calendar object
		cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		//business logic
 		if (hour < 12)
			return "Good Morning  "+user;
		else if (hour < 16)
			return "Good AfterNoon  "+user;
		else if (hour < 20)
			return "Good Evening  "+user;
		else
			return "Good Night  "+user;

	}//method

}//class
