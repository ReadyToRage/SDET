package LeetCode;

public class GetVowelsInAString {

	public static void main(String[] args) {
		
		String st = "agujefbiphodvu";
		
		String result = ReverseVowels(st);
		
		System.out.println(result);

	}
	
	public static boolean isVowel(char s) {
		s = Character.toLowerCase(s);
		return s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ;
	}
	
	public static String ReverseVowels(String str) {
		
		char[] cha = str.toCharArray();
				
		StringBuilder Vowels = new StringBuilder();
		
		StringBuilder NonVowels = new StringBuilder();
		
		for (char c : cha) {
			if(isVowel(c)) {
				Vowels.append(c);
			}else {
				NonVowels.append(c);
			}
		}
		
		Vowels.append(NonVowels);
		
		return Vowels.toString();
	}

}
