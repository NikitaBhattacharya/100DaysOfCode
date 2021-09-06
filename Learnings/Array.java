package com.amadeus.learnings;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};
		int brr[] = {3, 6, 9}; 
		ArrayList<Integer> ans;
		ans = Complete.compouteArray(arr, brr, 3);
		for(int i: ans) 
			System.out.print(i + " ");
		System.out.println();
	}

}

class Complete
{
    public static ArrayList<Integer> compouteArray(int a[][], int b[], int n)
    {
    	ArrayList<Integer> ans = new ArrayList<Integer>();
    	int sum = 0;
    	int largeNumber = 0;
    	for(int i = 0, j = 0; i<n ; i++,j++) {
    		sum = sum + a[i][j];
    		largeNumber = (b[i] >= largeNumber) ? b[i] : largeNumber;
    	}
    	ans.add(sum);
    	ans.add(largeNumber);
    	return ans;
    }
}
