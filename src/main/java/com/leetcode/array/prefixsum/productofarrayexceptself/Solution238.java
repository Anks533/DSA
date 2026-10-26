package com.leetcode.array.prefixsum.productofarrayexceptself;

public class Solution238 {
    public static void main(String[] args) {
        int[] res = productExceptSelf(new int[] {2, 3, 4, 5});
        System.out.println(res);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i == 0) {
                res[i] = 1;
                continue;
            }

            res[i] = nums[i-1] * res[i-1];

        }

        int right_prod = 1;
        for(int i=nums.length-2; i>=0; i--) {
            right_prod = right_prod * nums[i+1];
            res[i] = right_prod * res[i];
        }
        return res;
    }
}
