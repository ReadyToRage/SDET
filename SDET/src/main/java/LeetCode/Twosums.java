package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosums {

	public static void main(String[] args) {
		
		int nums[] = {2,3,5,6,7,8}; int target = 8;
		
		int[] result = hashmap(nums, target);	
		
		System.out.println(Arrays.toString(result));

	}
	
	public static int[] twosum(int[] num,int target) {
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target) {
					return new int[] {i,j};
				}
				
			}
		}		
		return new int[] {};
	}
	
	
	public static int[] hashmap(int[] n , int target) {
		
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n.length;i++) {
			int index = target - n[i];
			if(mp.containsKey(index)) {
				return new int[] {mp.get(index),i};
			}
			mp.put(n[i], i);
		}
		
		return new int[] {};
	}

}
