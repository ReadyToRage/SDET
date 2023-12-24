package DSA_SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort_Example {

	public static void main(String[] args) {
		int[] arrays=  {9,8,7,6,0,5,4,3,2,1};
		SelectionSortInt(arrays);
		System.out.println(Arrays.toString(arrays));
		
		String[] st = {"Hi","Hello","How","Are","You","&^"};
		SelectionSortString(st);
		System.out.println(Arrays.toString(st));
	} 
	
	public static void SelectionSortInt(int[] arr) {	
		
		//{9,8,7,6,0,5,4,3,2,1}
		
		int lengthOfArray = arr.length;		
		System.out.println("Length of array :"+lengthOfArray);
		
		for( int i=0;i<lengthOfArray-1;i++) {		    //Starts the loop with 1st element	
			int minIndex = i;				    		//Assume the 1st element in the array
			for(int j=i+1;j<lengthOfArray;j++) {		//start another loop with 2nd element 				
				if(arr[j] < arr[minIndex]) {			//compare the 2nd element with 1st element, if true
					minIndex = j; 	    				//assign to minindex
				}
			}			
			int temp = arr[minIndex];	    			
			arr[minIndex] = arr[i];						//swap
			arr[i] = temp;
		}
	}
	
	
	public static void SelectionSortString(String[] arr) {		
		int length = arr.length;		
		for(int i=0;i<length-1;i++) {			
			int MinIndex = i;			
			for(int j=i+1;j<length;j++) {				
				if(arr[j].compareTo(arr[MinIndex]) < 0) {
					MinIndex = j;
				}				
				String temp = arr[MinIndex];	    			
				arr[MinIndex] = arr[i];						//swap
				arr[i] = temp;
			}
		}		
	}
}
