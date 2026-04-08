package com.leetcode.twopointers.array.removeduplicatesorted;

public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2, 3, 3, 5, 6, 6, 7, 8, 9, 9};
        System.out.println("Unique elements :: " + removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1;
        int i = 0;
        int j = i+1;
        while(j <= nums.length-1) {
            if(nums[j-1] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
                k++;
            }
            j++;
        }
        return k;
    }
}
