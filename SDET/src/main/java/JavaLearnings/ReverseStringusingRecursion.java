package JavaLearnings;

public class ReverseStringusingRecursion {

	public static String gh(String h) {
		char[] ch = h.toCharArray();
		int start = 0 , end = ch.length-1;
		while( start < end ) {
			char temporary = ch[start];
			ch[start] = ch[end];
			ch[end] = temporary;
			start ++;
			end --;
		}
		return new String(ch);
	}
	
	public static String ReverseOnlyStringSentence(String s){		
		String[] st=s.split(" "); 		
		int length=st.length-1;		
		int start=0;		
		for(int i=start;i<length;i++){
			String temp = st[i];
			st[i] =  st[i+1];
			st[i+1] = temp;
		}
		return s;		
	}

	public static void main(String[] args) {
		String h = "Hey hi whatsapp";
		System.out.println(" Reversing all the letters and sentence : "+gh(h));
		System.out.println(" Reversing all the sentence : "+ReverseOnlyStringSentence(h));
	}

}
