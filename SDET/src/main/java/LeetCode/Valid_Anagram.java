package LeetCode;

import java.util.Arrays;
import java.util.Comparator;

import com.google.common.collect.Comparators;

public class Valid_Anagram {

	public static void main(String[] args) {
		//		 1. Anagram is the two strings contains same letters but in different letter order.
		//		 2. So,we need to find the length of two string should be same
		//		 3. If length is diff , it can't be anagrams.
		//		 4. Convert the strings to CharArrays and Sort the Arrays.
		//		 5. Compare the 2 character arrays , if equals return true .
		String A = "asdfghjkl";
		String B = "lkjhgfdsa";

		Boolean result = Anagrams(A, B);
		System.out.println(result);
	}

	public static boolean Anagrams(String Str , String Str2) {

		if(Str.length() != Str2.length()) {
			return false;
		}
		char[] st = Str.toCharArray(); 
		char[] tt = Str2.toCharArray();	
		Arrays.sort(st); Arrays.sort(tt); 
		return Arrays.equals(st,tt);
	}

}
