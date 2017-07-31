package com.company.codeclinic;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

public class WeatherCheckerImplTest extends TestCase {

	WeatherChecker weatherChecker;
	Map<String, Integer> listOfCities;
	
	protected void setUp() throws Exception {
		weatherChecker = new WeatherCheckerImpl();
		
		listOfCities = new HashMap<String, Integer>();
		listOfCities.put("Austria", 1);
		listOfCities.put("Belgium", 2);
		listOfCities.put("Cyprus", 3);
		listOfCities.put("Denmark", 4);
		listOfCities.put("Finland", 5);
		listOfCities.put("Germany", 6);
		listOfCities.put("Ireland", 7);
		listOfCities.put("Norway", 8);
		listOfCities.put("Poland", 9);
		listOfCities.put("United Kingdom", 10);
		listOfCities.put("Italy", 1);
		
	}
	
	public void testGetCityWithLowestTemp() {
		weatherChecker.getCityWithLowestTemp(listOfCities);
		
	}
	
	
	protected void tearDown() throws Exception {
		
	}

}
