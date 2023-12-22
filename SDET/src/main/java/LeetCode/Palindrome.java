package LeetCode;

public class Palindrome {

	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";
		 boolean result =Checkpalindrome(input);
		 System.out.println(result);
	}
		
	public static boolean Checkpalindrome(String s) {	
		//Palindrome is if we reverse the string the letters will be same eg : madam
		//check if string have other characters eg; numbers , @#@
		//loop using while
			
		s=s.toLowerCase();
		s=s.replaceAll("[^a-z0-9]","");
		int left = 0 , right = s.length()-1;
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}		
		return true;
		
	}
}
