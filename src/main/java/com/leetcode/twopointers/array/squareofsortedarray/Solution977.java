package com.leetcode.twopointers.array.squareofsortedarray;

public class Solution977 {

    public static void main(String[] args) {
        int[] res = sortedSquares(new int[] {7, 8});
        for (int re : res) {
            System.out.print(re);
        }
    }


    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i = 0;
        while(i<nums.length && nums[i] < 0) {
            i++;
        }

        if(i == nums.length) {
            // all negative
            int k = 0;
            for(int j = nums.length-1; j>=0; j--) {
                res[k++] = nums[j] * nums[j];
            }
        } else if(i == 0) {
            // all positive
            int k = 0;
            for (int num : nums) {
                res[k++] = num * num;
            }
        } else {
            // positive and negative
            res = mergeSortedArray(nums, i);
        }
        return res;
    }

    private static int[] mergeSortedArray(int[] nums, int index) {
        int[] res = new int[nums.length];
        int pos = index;
        int neg = index - 1;
        int k = 0;
        while(neg >=0 && pos < nums.length) {
            int neg_sqr = nums[neg] * nums[neg];
            int pos_sqr = nums[pos] * nums[pos];
            if(neg_sqr < pos_sqr) {
                res[k++] = neg_sqr;
                neg--;
            } else if (pos_sqr < neg_sqr) {
                res[k++] = pos_sqr;
                pos++;
            } else {
                res[k++] = pos_sqr;
                res[k++] = neg_sqr;
                neg--;
                pos++;
            }
        }

        while(pos < nums.length) {
            int pos_sqr = nums[pos] * nums[pos];
            res[k++] = pos_sqr;
            pos++;
        }

        while(neg >=0) {
            int neg_sqr = nums[neg] * nums[neg];
            res[k++] = neg_sqr;
            neg--;
        }
        return res;
    }
}
