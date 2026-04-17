package com.leetcode.twopointers.array.sortcolors;

public class Solution75 {
    public static void main(String[] args) {
        int[] nums = new int[] {0,2,1,0,2,1,1};
        sortColors(nums);
        System.out.print(nums);
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp = 0;
        while(mid <= high) {
            if(nums[mid] == 0) {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // nums[mid] == 2
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}

