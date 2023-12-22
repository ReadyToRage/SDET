package LeetCode;

public class BinarySearch_Algorithm {

	public static void main(String[] args) {
//		Rule 1 : Binary search will work on sorted elements.
//		Rule 2 : It will pick the middle element in the array or inputs.
//		Rule 3 : It will compare the middle element with target element.
//		Rule 4 : if middle element is < than target element 
//		Rule 5 : Then the left element should be moved (middle element + 1;)
//		Rule 6 : if middle element is > than target element , Then the left element should be moved (middle element - 1;)
		int [] num = {1,2,3,4,5,6,7,8,9};
		int target = 9;
		int result = BinarySearch(num, target);
		System.out.println(result);
	}

	public static int BinarySearch(int n[],int target) {		
		// n[] = {1,2,3,4,5,6,7,8,9};
		//target = 5;
		int low = 0 , high = n.length-1;
		while( low <= high) {
			int	mid = low + ( high - low ) / 2;
			if( n[mid] == target ) {				
				return mid;
			}else if( n[mid] < target) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
