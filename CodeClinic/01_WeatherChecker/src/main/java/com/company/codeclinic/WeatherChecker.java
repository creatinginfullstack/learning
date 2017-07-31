package com.company.codeclinic;

import java.util.Map;

public interface WeatherChecker {

	public String getCityWithLowestTemp(Map<String, Integer> listOfCities); 
	
}
