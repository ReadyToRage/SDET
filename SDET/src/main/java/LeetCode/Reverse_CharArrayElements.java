package LeetCode;

public class Reverse_CharArrayElements {

	public static void main(String[] args) {
		
//		1. start the iteration using while loop from first element in Array till the last element.
//		2. if condition is true , create a temp variable and store it
//		3. swap until the condition is true .
//		4. print that reversed array using foreach loop.
		
		char[] ele = {'A','B','C','D','E'};
		ReverseArr(ele);
		for (char c : ele) {
			System.out.print(c);
		}
	}	
	public static void ReverseArr(char[] Arr) {		
		int start = 0 , end = Arr.length-1;		
		while( start < end ) {		
			char temp = Arr[start];
			Arr[start] = Arr[end];
			Arr[end] = temp;
			start++;
			end--;
		}
	}
}
