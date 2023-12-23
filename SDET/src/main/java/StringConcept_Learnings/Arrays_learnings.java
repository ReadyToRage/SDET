package StringConcept_Learnings;

import static org.testng.Assert.assertEquals;

public class Arrays_learnings {

	public static void main(String[] args) {
		
		// Array only contain same data type
		
		String[] num = {"b","g","3"};
		
		for (String string : num) {								
			for(int i=0;i<string.length();i++) {
				char c = string.charAt(i);	
				if(!Character.isAlphabetic(c)) {
					System.out.println("Non alphabet :"+string);
				}else {
					System.out.println("Alphabet :"+string);
				}				
			}
		}
				
		//System.out.println("Array length : "+num.length);
		
	
	}

}
