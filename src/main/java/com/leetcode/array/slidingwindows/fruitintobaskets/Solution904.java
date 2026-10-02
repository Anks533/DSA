package com.leetcode.array.slidingwindows.fruitintobaskets;

import java.util.HashMap;
import java.util.Map;

public class Solution904 {
    public static void main(String[] args) {
        System.out.println(totalFruit(new int[] {1,2,3,4,5,6,3,3,2}));
    }

    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;
        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while(map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}
