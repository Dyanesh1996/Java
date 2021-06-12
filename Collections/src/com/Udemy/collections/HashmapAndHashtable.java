/*Map--------	
	- Is used to achieve key-value pairing for our convenience.
	- Order of getting elements from set is random unlike Lists.
	
	- Map.Entry is used to fetch entire map..Another method(along with enhanced for loop) to fetch map
		Entry is the interface inside map interface
*/


/*			Hashmap														Hashtable
	- not thread safe, unsynchronized							- thread safe, synchronized.
	- fast														- slow
	- works with single thread									- works with multiple threads
	- Allows one null key										- Doesn't allow null key 
*/

package com.Udemy.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapAndHashtable {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap();
		
		map.put("MI", 5);
		map.put("CSK", 3);
		map.put("KKR", 2);
		map.put("RR", 1);
		map.put("SRH", 1);
		
		//Way 1 of printing map
		Set<String> keys =  map.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		
		//Way 2--> Using map.entry()
		Set<Map.Entry<String, Integer>> values = map.entrySet();
		for(Map.Entry<String, Integer> e : values) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}	
	}

}
