package DSA_SearchAlgorithms;

public class InterpolationSearchAlgorithm {

	public static void main(String[] args) {
		int[] arr = {1,4,6,3,2,7,3,8,9};
		int Result = InterpolationSearch_Algorithm(arr,9);
		if(Result== -1) {			
			System.out.println(" Element Not found :"+ Result);
		}else {
			System.out.println(" Element found at index :"+ Result);
		}
	}	
	//Rule
	//1. It will find the position of the element by formula
	//2. rest like binary search
	
	public static int InterpolationSearch_Algorithm(int[] arr,int target) {		
		int low = 0 , high = arr.length-1;		
		while( low <= high && target <= arr[high] && target >= arr[low] ) {		
			//Formula for finding position
			int position = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);
			if(arr[position] == target) {
				return position;
			}else if(arr[position] < target){
				low = position + 1;
			}else {
				high = position - 1;
			}
		}		
		return -1;
	}
}
