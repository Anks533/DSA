package com.leetcode.twopointers.array.twosumsorted;

public class Solution {
    public static void main(String[] args) {
        int[] sorted_array = {2,7,11,15};
        int target = 18;
        int[] sum = twoSum(sorted_array, target);
        if(null != sum) {
            for (int j : sum) {
                System.out.print(j);
            }
        }
    }

    private static int[] twoSum(int[] sortedArray, int target) {
        if(null == sortedArray || sortedArray.length == 0) {
            return null;
        }

        int[] pair = new int[2];
        int i = 0;
        int j = sortedArray.length - 1;

        while(i < j) {
            int sum = sortedArray[i] + sortedArray[j];
            if(sum == target) {
                pair = new int[]{ i+1, j+1 };
                break;
            }

            if(sum < target) {
                i++;
            }

            if(sum > target) {
                j--;
            }
        }
        return pair;
    }
}
