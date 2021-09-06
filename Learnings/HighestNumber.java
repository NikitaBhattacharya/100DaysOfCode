package com.amadeus.learnings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighestNumber {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine().trim());
			int a[] = new int[n];
			String inputline[] = br.readLine().trim().split(" ");
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(inputline[i]);
			}
			Compute obj = new Compute();
			System.out.println(obj.largest(a, n));
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

}

//User function Template for Java

class Compute {

	public int largest(int arr[], int n) {
		int nMax = 0;
		for (int num : arr) {
			nMax = (num >= nMax) ? num : nMax;
		}
		return nMax;
	}
}