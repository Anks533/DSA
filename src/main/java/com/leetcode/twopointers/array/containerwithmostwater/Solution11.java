package com.leetcode.twopointers.array.containerwithmostwater;

public class Solution11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int area = 0;
        int i = 0;
        int j = height.length-1;
        int length = 0;
        int width = 0;

        while(i<j) {
            length = Math.min(height[i], height[j]);
            width = j - i;
            area = length * width;
            maxArea = Math.max(area, maxArea);

            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
