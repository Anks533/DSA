package com.leetcode.twopointers.array.trappingrainwater;

public class Solution42 {
    public static void main(String[] args) {
        System.out.print(trap(new int[] {4,2,0,3,2,5}));
    }

    public static int trap(int[] height) {
       int area = 0;
       int l = 0;
       int r = height.length-1;
       int left_max = height[l];
       int right_max = height[r];

       while(l<r) {
          if(left_max < right_max) {
              l++;
              left_max = Math.max(left_max, height[l]);
              area = area + (left_max - height[l]);
          } else {
              r--;
              right_max = Math.max(right_max, height[r]);
              area = area + (right_max - height[r]);
          }
       }

       return area;
    }
}
