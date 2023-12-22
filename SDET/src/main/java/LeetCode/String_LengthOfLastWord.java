package LeetCode;

public class String_LengthOfLastWord {

	public static void main(String[] args) {
		String s = " hello world ";
		int result = LengthOfLastWord(s);
		System.out.println(result);
	}

	public static int LengthOfLastWord(String s) {
		// hello world 		
		if(s.contains(" ")) {			
			String[] arr = s.split(" ");
			for(int i=0;i<arr.length-1;i++) {
				return arr[arr.length-1].length();
			}
		}				
		return s.length();
	}

}
