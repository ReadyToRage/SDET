package StringConcept_Learnings;

import java.util.stream.IntStream;

public class Strings_Learnings {

	public static void main(String[] args) {
		//STRING class

		String str = "Hello";

		char[] characters = str.toCharArray();

		int length = characters.length-1;  // Array starts with index 0
		System.out.println(characters[length]);  //return "O" as it is in 5th index

		str.length();  //return the number of characters in string eg: String st = "hello"; //op is 5
		System.out.println(str.length()-1);

		char charac = str.charAt(0);  //return the specified character in the string

		str.toLowerCase();	//String to lower case
		str.toUpperCase();	//String to upper case
		str.toString();  //Convert to string

		str.compareTo(str);  //return int more or less the 0 
		str.compareToIgnoreCase(str);  //return int more or less the 0 

		str.isBlank();	//Returns true if the string is empty or contains only white space codepoints, otherwise false.
		str.isEmpty();	//Returns true if, and only if, length() is 0.

		//str.getChars(0, 0, null, 0);  //get the characters from the range


		String[] strch = str.split(str);  //return String [] array characters
		String[] strc = str.split(str, 0);	//split characters from regex

		//Space related in string 

		str.trim();		//remove spaces from starting & ending of string
		str.strip();	//remove unicode characters eg: \u2000
		str.stripIndent();  //remove spaces from beginning at each line of string
		str.stripLeading();	//remove tab / spacebar spaces from beginning at each line of string
		str.stripTrailing();//remove spaces from end at each line of string

		str.substring(2); 	//extract the string from the defined index
		str.substring(0, 0);	//extract the string from the range

		CharSequence chseq = str.subSequence(0, 0); //returns the character and doing the functionality of substring

		str.concat(str);   //add one string to another

		str.contains("o");		//Returns true if and only if this string contains the specified sequence of char values.
		str.equals(str);		//Compares this string to the specified object.
		str.contentEquals(str);	//Compares this specified characters to the specified object.

		String.copyValueOf(characters);		//copy the characters and return as String
		int offset = 5 , count = 5;
		//String.copyValueOf(characters, offset, count);		//copy the characters from indexlength and number of charac

		str.startsWith(str);	//return true if starts with characters
		str.startsWith(str, 0);	//return true if character starts with specified offset index
		str.endsWith(str);		//return true if ends with characters

		str.indexOf(0);		//returns the index character
		str.indexOf('g', 3);// Find the index of 'g' starting from index 3
		str.lastIndexOf(0); //returns last index of character
		str.lastIndexOf('g', 3);// Find the index of 'g' ending from index 3


		str.intern(); //checking the memory of same content

		String restr = str.repeat(3);
		System.out.println(restr);   //repeat the string 


		str.replace("H", "J");  	//replace the character with defined character
		str.replaceAll("H", "J");	//replace all the character with defined character
		str.replaceFirst("o", "a");	//replace 1st character with defined character

		//String class

		String.valueOf(false);
		String.valueOf(charac);
		String.valueOf(characters);
		String.valueOf(count);
		String.valueOf(offset);
		String.valueOf(length);
		String.valueOf(restr);
		//String.valueOf(characters, offset, count);

		//lot more to learn
		Character.isAlphabetic(0);
		Character.isLowerCase(0);
		Character.isUpperCase(0);
		Character.isDigit(0);
		Character.isWhitespace(0);
		Character.isSpaceChar(0);
		Character.isLetter(0);
		Character.isLetterOrDigit(0);
		Character.getNumericValue(0);
		Character.getName(0);
		Character.getType(0);

		// Character for which you want to find the ASCII value
		char ch = 'Z';
		// Casting the character to int to get the ASCII value
		int asciiValue = (int) ch;
		System.out.println(asciiValue);

		// ASCII value
		int asciiValue1 = 65; // Example: ASCII value for 'A'
		// Convert ASCII value to character
		char character = (char) asciiValue1;
		// Print the result
		System.out.println("Character: " + character); // Output: A



	}

}
