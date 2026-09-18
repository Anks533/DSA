package com.leetcode.array.slidingwindows.maxConsecutiveOnes;

public class Solution485 {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max_sum = 0;
        int counter = 0;

        for (int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                counter++;
            } else {
                max_sum = Math.max(max_sum, counter);
                counter = 0;
            }
        }
        max_sum = Math.max(max_sum, counter);

        return max_sum;

    }

}
