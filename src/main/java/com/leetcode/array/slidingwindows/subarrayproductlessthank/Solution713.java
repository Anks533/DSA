package com.leetcode.array.slidingwindows.subarrayproductlessthank;

public class Solution713 {

    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[] {686, 28, 455, 675, 605, 29, 942, 48, 502, 889, 854, 206, 231, 796, 272, 565, 887, 969, 558, 13, 22, 455, 145, 804, 15}, 515854 ));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <=1) {
            return 0;
        }

        int left = 0;
        int product = 1;
        int count = 0;
        for(int right = 0; right < nums.length; right++) {
            product *= nums[right];
            while(product >= k) {
                product /= nums[left];
                left++;
            }
            count += (right - left) + 1;
        }

        return count;

    }
}
