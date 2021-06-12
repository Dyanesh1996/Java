/*Map--------	
	- Is used to achieve key-value pairing for our convenience.
	- Order of getting elements from set is random unlike Lists.
	
	- Map.Entry is used to fetch entire map..Another method(along with enhanced for loop) to fetch map
		(Refer HashmapAndHashtable class to know about map entry)
*/




package com.Udemy.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("myName", " Dnyanesh");					//'put' and not 'add'
		map.put("favCricketer", " Sachin");
		map.put("favBand", " Coldplay");
		map.put("favGame", "Cricket");
		map.put("favBand", "Imagine Dragons");			//Will replace 'Coldplay'..can't have same key, can have same value
		
		System.out.println(map.get("favCricketer"));	
		System.out.println(map.get("favBand123"));		//will give "null" 
		
		//But how to print entire map--->Use 'map.keySet()' method.
		
		Set<String> keys = map.keySet();				//Store keys in set to use them later.

		
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
	}

}
