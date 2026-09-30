package com.leetcode.array.slidingwindows.subarraywithkdiffintegers;

import java.util.HashMap;
import java.util.Map;

public class Solution992 {
    public static void main(String[] args) {
        int k = 2;
        System.out.println(atMost(new int[] {1,2,1,2,3}, k) - atMost(new int[] {1,2,1,2,3}, k-1));
    }

    public static int atMost(int[] nums, int k) {
        int left = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while(map.size() > k) {
                map.put(nums[left], map.get(nums[left])- 1);
                if(map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            count = count + right-left+1;

        }

        return count;

    }
}
