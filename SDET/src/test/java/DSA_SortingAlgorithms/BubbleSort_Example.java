package DSA_SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort_Example {

	public static void main(String[] args) {
		
		int[] arrays=  {9,8,7,6,0,5,4,3,2,1};
		BubbleSortEx(arrays);
		System.out.println(Arrays.toString(arrays));
		
		String[] st = {"Hi","Hello","How","Are","You","&^"};
		BubbleSortString(st);
		System.out.println(Arrays.toString(st));
	}
	
	
	public static void BubbleSortEx(int[] arr) {
		int lengthofArray = arr.length-1;      		//Length of the array
		for(int i=0;i<lengthofArray-1;i++) {		//Starts the loop in the array
			for(int j=0;j<lengthofArray-i;j++) {	//start the inner for comparing elements
				if(arr[j] > arr[j+1]) {				//compare the 0th element with 1st element and so on ...
					int temp = arr[j];
					arr[j] = arr[j+1];				//swap until this is true
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void BubbleSortString(String[] arr) {
		
		for( int i=0; i<arr.length-1;i++) {			
			for(int j=0;j<arr.length-1-i;j++) {				
				if(arr[j].compareTo(arr[j+1]) > 0) {				
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}
