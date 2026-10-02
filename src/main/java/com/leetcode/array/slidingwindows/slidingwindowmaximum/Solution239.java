package com.leetcode.array.slidingwindows.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

public class Solution239 {
    public static void main(String[] args) {
        int[] res = maxSlidingWindow(new int[] {1,3,1,2,0,5}, 3);
        for (int i=0; i< res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1]; // 8-3+1 = 6
        Deque<Integer> deque = new LinkedList<>();

        for(int right = 0; right < nums.length; right++) {

            if(!deque.isEmpty() && deque.peekFirst() <= right-k) {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[right] ) {
                deque.pollLast();
            }
            deque.addLast(right);

            if(right >= k-1) {
                res[right-k+1] = nums[deque.peekFirst()];
            }
        }

        return res;
    }
}
