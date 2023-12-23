package DataStructures_Algorithms;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		int[] arr = {1,4,6,3,2,7,3,8,9};		
		int Result = LinearSearch(arr,9);		
		if(Result== -1) {			
			System.out.println(" Element Not found :"+ Result);
		}else {
			System.out.println(" Element found at index :"+ Result);
		}
		
		String[] arrays = {"Hi","Hello","How","are","you"};
		
		int res = StrLinearSearch(arrays,"How");
		
		if(res== -1) {			
			System.out.println(" Element Not found :"+ res);
		}else {
			System.out.println(" Element found at index :"+ res);
		}
		
		
	}	
	//Rules
	//1. It will work on sorted and unsorted elements
	//2. It will traverse through each elements in the list / arrays.	
	public static int LinearSearch(int[] num,int target) {		
		for( int i=0;i<num.length;i++) {			
			if(num[i]==target) {				
				return i;
			}
		}		
		return -1;
	}
	
	public static int StrLinearSearch(String[] arr,String target) {
		
		for( int i=0;i<arr.length;i++) {
			if(arr[i].equalsIgnoreCase(target) ) {
				return i;
			}
		}
		
		return -1;
	}

}
