package JavaLearnings;

import java.util.Arrays;

public class Sortings {

	public static void main(String[] args) {

		int arr[] = {9,8,7,6,5,4,3,2};

		sortingbubble(arr);
		
		Arrays.toString(arr);
		
		System.out.println(Arrays.toString(arr));

	}

	public static void sortingbubble(int arr[]) {

		for(int i=0;i<arr.length-1;i++) {

			for(int j=0;j<arr.length-i-1;j++) {

				if(arr[j] > arr[j+1]) {

					int temp = arr[j];

					arr[j] = arr[j+1];

					arr[j+1] = temp;

				}
			}
		}
	}


}
