package com.leetcode.array.slidingwindows.maximumSubarraySum;

import java.util.HashMap;
import java.util.Map;

public class Solution2461 {

    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[] {1,5,4,2,9,9,9}, 3));
    }
    public static int maxSubArraySum(int[] nums, int k) {
       int max_sum = 0;
       int sum = 0;
       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<k; i++) {
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
           sum += nums[i];
       }

       for(int j=k; j<=nums.length; j++) {
           if(map.size() == k) { // if unique
               max_sum = Math.max(max_sum, sum);
           }

           if(j<nums.length) {
               // remove from the beginning of sub-array
               sum -= nums[j - k]; // remove from sum
               map.put(nums[j - k], map.get(nums[j - k]) - 1); // remove from map
               if (map.get(nums[j - k]) == 0) {
                   map.remove(nums[j - k]);
               }

               // add new one at the end.
               map.put(nums[j], map.getOrDefault(nums[j], 0) + 1); // add to map
               sum += nums[j]; // add to sum
           }

       }

       return max_sum;
    }
}
