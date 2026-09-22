package com.leetcode.array.slidingwindows.maxConsecutiveOnesIII;

public class Solution1004 {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }

    private static int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                zeroCount++;
            }

            if(zeroCount > k) {
                if(nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
        }
        return nums.length - left;

    }
}
