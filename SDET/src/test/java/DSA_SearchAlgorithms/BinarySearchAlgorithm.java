package DSA_SearchAlgorithms;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9};
		int Result = BinarySearchAlgo(arr,3);
		if(Result== -1) {			
			System.out.println(" Element Not found :"+ Result);
		}else {
			System.out.println(" Element found at index :"+ Result);
		}

		String[] arrays = {"a","b","c","d","e"};
		int res = StrbinarySearch(arrays,"e");
		if(res== -1) {			
			System.out.println(" Element Not found :"+ res);
		}else {
			System.out.println(" Element found at index :"+ res);
		}

	}

	//Rules
	//1. It will work on only sorted elements
	//2. It will pick the middle element 
	//3. Check the middle element with the target element

	public static int BinarySearchAlgo(int[] arr,int target) {		
		int left = 0, right = arr.length-1;		
		while( left <= right ) {
			int middle = left + (right-left) / 2;			
			if(arr[middle] == target) {
				return middle;
			}else if(arr[middle] < target){
				left = middle + 1;
			}else {
				right = middle -1;
			}
		}
		return -1;
	}

	public static int StrbinarySearch(String[] arr,String tar) {		
		int lower = 0 , higher = arr.length-1;		
		while(lower <= higher) {
			int middle = lower + (higher - lower) / 2;
			if(arr[middle].compareTo(tar) == 0) {
				return middle;
			}else if(arr[middle].compareTo(tar) > 0) {
				higher = middle -1;
			}else {
				lower = middle + 1;
			}
		}		
		return -1;
	}

}
