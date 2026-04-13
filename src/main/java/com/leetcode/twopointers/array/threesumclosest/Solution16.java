package com.leetcode.twopointers.array.threesumclosest;

import java.util.Arrays;

public class Solution16 {
    public static void main(String[] args) {
        System.out.print("Closest Sum is :: " + threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // nlog(n) complexity
        int closest = Integer.MAX_VALUE;
        int closest_sum = 0;
        for(int i=0; i<nums.length-2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int diff = Math.abs(target - sum);
                if(closest > diff) {
                    closest = diff;
                    closest_sum = sum;
                }
                if(sum == target) {
                    return sum;
                } else if(sum > target) {
                    right--;
                } else {
                    // less than target
                    left++;
                }
            }
        }
        return closest_sum;
    }
}
