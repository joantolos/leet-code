package com.joantolos.sort;

public class Solution {

    public int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int pIndex = 0;
            int qIndex = 0;

            for (int i1 = 0; i1 < nums.length; i1++) {
                if (nums[i1] == nums[i]) pIndex = i1;
                if (nums[i1] == nums[min]) qIndex = i1;
            }
            int oldP = nums[pIndex];
            nums[pIndex] = nums[qIndex];
            nums[qIndex] = oldP;
        }
        return nums;
    }

    protected boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1]) return false;
        return true;
    }
}
