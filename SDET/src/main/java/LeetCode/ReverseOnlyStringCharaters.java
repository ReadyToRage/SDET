package LeetCode;

public class ReverseOnlyStringCharaters {

	public static void main(String[] args) {
		String d = "R@hu&l";
		reverseString(d);
		System.out.println(reverseString(d));

	}


	public static String reverseString(String str) {

		char[] st = str.toCharArray();	
		int start = 0 , end = st.length-1;	
		while( start < end) { 			
			while(!Character.isAlphabetic(st[start])) {
				start++;
			}
			while(!Character.isAlphabetic(st[end])) {
				end--;
			}
			char temp = st[start];
			st[start] = st[end];
			st[end] = temp;			
			start ++;
			end --;
		}		
		return new String(st);
	}

}
