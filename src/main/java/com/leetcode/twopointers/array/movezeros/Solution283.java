package com.leetcode.twopointers.array.movezeros;

public class Solution283 {

    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,3,12}; // 1, 3, 12, 0, 0
        movezeros(nums);
    }

    private static void movezeros(int[] nums) {
        int i = 0;
        int j = 0;
        int temp = 0;

        while(j < nums.length && i <= j) {
            if(nums[j] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

        for(int k=0; k<nums.length; k++) {
            System.out.println(nums[k]);
        }
    }
}
