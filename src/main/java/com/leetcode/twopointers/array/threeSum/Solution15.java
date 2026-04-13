package com.leetcode.twopointers.array.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum(new int[] {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0});
        System.out.print(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i< nums.length-2; i++) {
            int target = -nums[i]; // first number i.e target of 2 sum - [a+b+c = 0 or b+c = -a]
            if( i > 0 && nums[i] == nums[i-1]) {
                // to avoid duplicates
               continue;
            }

            int j = i+1;
            int k = nums.length-1;

            while(j<k) {
                int sum = nums[j] + nums[k];
                if(sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    // equal
                    List<Integer> tuples = new ArrayList<>();
                    tuples.add(-target);
                    tuples.add(nums[j]);
                    tuples.add(nums[k]);
                    threeSumList.add(tuples);
                    j++;
                    k--;

                    while(j < nums.length &&  nums[j] == nums[j-1]) {
                        // to avoid duplicates
                        j++;
                    }

                    while(k >= 0 &&  nums[k] == nums[k+1]) {
                        // to avoid duplicates
                        k--;
                    }
                }
            }
        }
        return  threeSumList;
    }
}
