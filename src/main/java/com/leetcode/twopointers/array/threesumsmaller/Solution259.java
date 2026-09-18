package com.leetcode.twopointers.array.threesumsmaller;

public class Solution259 {
    public static void main(String[] args) {
        System.out.print(threeSumSmaller(new int[] {-2, 0, 1, 3}, 2));
    }

    public static int threeSumSmaller(int[] nums, int target) {
        int threeSumSmaller = 0;
        for(int i=0; i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum >= target) {
                    right--;
                } else {
                    threeSumSmaller = threeSumSmaller + (right - left);
                    left++;
                }
            }
        }

        return threeSumSmaller;
    }
}
