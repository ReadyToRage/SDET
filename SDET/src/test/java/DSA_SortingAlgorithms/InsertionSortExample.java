package DSA_SortingAlgorithms;

import java.util.Arrays;

public class InsertionSortExample {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };
		Insertion_Sort_Algorithm(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void Insertion_Sort_Algorithm(int[] array) {
		
		//int arr[] = { 12, 11, 13, 5, 6 };
		
		for(int i=0;i<array.length;i++) {
			
			int key = array[i];
			
			int j = i - 1;
			
			while( j >= 0 && array[j] > key) {   
				
				array[ j + 1 ] = array [ j ];
				
				j = j - 1;
				
			}
			array[j+1] = key;
					
		}
		
		
		
	}

}
