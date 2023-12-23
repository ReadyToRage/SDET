package DataStructures_Algorithms;

import java.util.HashMap;

public class HashSearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(null, null);
		
		hashmap.put(0, null);
		
		hashmap.put(1, "Hi");
		
		hashmap.put(2, "Hello");
		
		System.out.println(hashmap);
		
		int key = 1;
		
		if(hashmap.containsKey(key)) {
			String value= hashmap.get(key);
			System.out.println(value);
		}else {
            System.out.println(key + " not found");
        }
		

	}
	
	

}
