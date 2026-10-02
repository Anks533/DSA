package com.leetcode.array.slidingwindows.minimumsizesubarray;

public class Solution209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int min_subarray = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right <nums.length; right++) {
            sum += nums[right];
            while(sum >= target) {
                min_subarray = Math.min(min_subarray, right-left+1);
                sum -= nums[left];
                left++;
            }
        }

        if(min_subarray == Integer.MAX_VALUE) {
            return 0;
        }

        return min_subarray;

    }
}

