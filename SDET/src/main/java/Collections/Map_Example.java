package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_Example {

	public static void main(String[] args) {
		

	}
	
	public static void HashMpExample() {
		
		HashMap<Integer,Integer> hashmap = new HashMap<>();
		
		hashmap.containsKey(null);
		hashmap.containsValue(null);
		
		hashmap.get(null);
		
		hashmap.keySet();
		hashmap.entrySet();
		
		hashmap.put(null, null);
		hashmap.putIfAbsent(null, null);
		
		hashmap.remove(null);
		hashmap.remove(null, null);
		hashmap.replace(null, null);
		hashmap.replace(null, null, null);
		
	}
	
	public static void Linkedhashmap() {
		
		LinkedHashMap<Integer,Integer> linkedhashmap = new LinkedHashMap<>();
		
		linkedhashmap.put(null, null);
		linkedhashmap.remove(null);
		linkedhashmap.remove(null, null);
		linkedhashmap.replace(null, null);
		linkedhashmap.replace(null, null, null);
		
		linkedhashmap.entrySet();
		linkedhashmap.keySet();
		
		linkedhashmap.containsKey(null);
		linkedhashmap.containsValue(null);
		
		linkedhashmap.isEmpty();
				
	}
	
	
	public static void TreeMap() {
		
		java.util.TreeMap< Integer,Integer> treemap = new java.util.TreeMap<>();
		
		treemap.descendingMap();
		
		treemap.descendingKeySet();
		
		treemap.pollFirstEntry();
		treemap.pollLastEntry();
		
		treemap.firstEntry();
		treemap.lastEntry();
		
		treemap.ceilingEntry(null);
		treemap.ceilingKey(null);
		
		treemap.remove(null);
		treemap.remove(treemap, treemap);
		treemap.replace(null, null);
		treemap.replace(null, null, null);
		
		treemap.floorEntry(null);
		treemap.floorKey(null);
		
		treemap.firstKey();
		treemap.lastKey();
		
		treemap.comparator();
		
		treemap.containsKey(null);
		treemap.containsValue(null);
		
		treemap.lowerEntry(null);
		treemap.lowerKey(null);
		
		treemap.higherEntry(null);
		treemap.higherKey(null);
		
		treemap.headMap(null);
		treemap.headMap(null, false);
		
		treemap.subMap(null, null);
		treemap.subMap(null, false, null, false);
		
		treemap.tailMap(null);
		treemap.tailMap(null, false);
		
		treemap.size();
		
		treemap.values();
	
	}

}
