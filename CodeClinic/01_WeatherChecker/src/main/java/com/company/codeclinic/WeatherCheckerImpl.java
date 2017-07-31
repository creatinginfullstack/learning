package com.company.codeclinic;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class WeatherCheckerImpl implements WeatherChecker {

	@Override
	public String getCityWithLowestTemp(Map<String, Integer> listOfCities) {
		System.out.println("start WeatherCheckerImpl.getCityWithLowestTemp");
		String cityWithLowestTemp = null;
		Integer lowestTemp = null;
		
		if(null != listOfCities) {
			System.out.println("listOfCities is not null.");
			
			boolean firstTime = true;
			int forCompare = 0;
			Set<String> keys = listOfCities.keySet();
			Iterator<String> keysIterator = keys.iterator();
			while(keysIterator.hasNext()) {
				if (firstTime) {
					String key = keysIterator.next();	
					forCompare = listOfCities.get(key);
					firstTime = false;
				} else {
					String key = keysIterator.next();
					int value = listOfCities.get(key);
					if(value < forCompare) {
						forCompare = value;
						cityWithLowestTemp = key;
						lowestTemp = forCompare;
					}
				}
			}
			System.out.println("cityWithLowestTemp: " + cityWithLowestTemp + "; lowestTemp: " + lowestTemp);
		} else {
			System.out.println("listOfCities is null.");
		}
		
		System.out.println("done WeatherCheckerImpl.getCityWithLowestTemp");
		return cityWithLowestTemp;
	}

}
