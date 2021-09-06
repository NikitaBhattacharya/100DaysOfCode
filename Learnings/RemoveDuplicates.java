package com.amadeus.learnings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;
		int size = Solution2.removeElement(nums, val);
		System.out.println(size);
		for (int i : nums)
			System.out.print(i + " ");

	}
}

class Solution1 {
	public static int removeElement(int[] nums, int val) {
		int arraySize = nums.length;
		for (int i = 0; i < arraySize; i++) {
			if (nums[i] == val) {
				--arraySize;
				for (int j = i; j < arraySize; j++) {
					if (j < nums.length)
						nums[j] = nums[j + 1];
				}
				--i;
			}
		}
		return arraySize;
	}
}

class Solution2 {
	public static int removeElement(int[] nums, int val) {
		int arraySize = nums.length;
		for (int i = 0; i < arraySize; i++) {
			if (nums[i] == val) {
				while (arraySize > i) {
					int index = arraySize - 1;
					if (nums[index] != val) {
						nums[i] = nums[index];
						nums[index] = val;
						break;
					} else {
						--arraySize;
						continue;
					}
				}
			}
		}
		return arraySize;
	}
}