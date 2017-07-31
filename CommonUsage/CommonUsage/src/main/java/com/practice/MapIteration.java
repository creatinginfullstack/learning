package com.practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public void iterateCollection(Collection col) {
		
		if(null != col && col.size() > 0) {
			Iterator i = col.iterator();
			for (Iterator iterator = col.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				System.out.println(object);
			}
		}
	}
	
	public void iterateMap(Map map) {
		
		
		
	}
	
	public void printMsg(String str) {
		System.out.println(str);
	}
	
}
