package LeetCode;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack =
				"sadbutsad";

		String needle = "sad";
		
		int result = strStr1(haystack, needle);
		
		System.out.println(result);
	}
	
	public static int strStr1(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }      
       int haystacklength = haystack.length(); 
       int needlelength = needle.length();
       for (int i = 0; i <= haystacklength - needlelength; i++) {
           String data = haystack.substring(i, i + needlelength);
            if (data.equals(needle)) {
                return i;
            }
        }
       return -1;
    }


	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
}
