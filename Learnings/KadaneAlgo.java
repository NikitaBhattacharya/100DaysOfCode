package com.amadeus.learnings;

public class KadaneAlgo {

	public static void main(String[] args) {
		int[] arr = {-2, -1};
		int sum = SolutionMaxArray.maxSubArray(arr);
		System.out.println(sum);
	}

}

class Solution {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = 0;
		int negSum = nums[0];
        for(int i =0; i<nums.length; i++) {
        	if(sum + nums[i] > 0) {
        		sum = sum + nums[i];
        	}else {
        		sum = 0;
        		if(i !=0 && nums[i] > negSum)
        			negSum = nums[i];
        	}
        	if(sum == 0 && ans == 0) {
        		ans = negSum;
        	} else if(sum > ans && sum !=0) {
        		ans = sum;
        	} else if(ans != 0 && ans<negSum) {
        		ans = negSum;
        	}
        }
        return ans;
    }
}

class NegativeSolution {
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = nums[0];
        for(int i =1; i<nums.length; i++) {
        	sum = (nums[i] > sum + nums[i]) ? nums[i] : sum ;
        	ans = (ans > sum) ? ans : sum; 
        }
        return ans;
    }
}

class SolutionMaxArray {
	public static int max(int a, int b) {
		return (a>b) ? a : b;
	}
	public static int maxSubArray(int[] nums) {
	 int max_sum = -100000;
     int sum_tillnow = 0;
     
     for(int i=0;i<nums.length;i++){
         sum_tillnow += nums[i];
         sum_tillnow = max(sum_tillnow,nums[i]);
         max_sum = max(sum_tillnow,max_sum);
         if(sum_tillnow<0)
             sum_tillnow=0;
     }
     return max_sum;
	}
}

