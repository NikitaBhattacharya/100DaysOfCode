package com.amadeus.learnings;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 5, 13}; 
		int left = 0;
		int right = arr.length - 1;
		boolean found = BinarySearchSolution.BinarySearchIterative(arr, 3, left, right);
		System.out.println(found);
	}

}

class BinarySearchSolution {
	
	public static boolean BinarySearchIterative(int arr[], int n, int left, int right) {
		while(left <= right) {
			int mid = left + (right-left)/2;
			if(n == arr[mid]) {
				return true;
			}else if (n < arr[mid]) {
				return BinarySearchIterative(arr, n, left, mid-1);
			}else {
				return BinarySearchIterative(arr, n, mid+1, right);
			}
		}
		return false;
	}
}
