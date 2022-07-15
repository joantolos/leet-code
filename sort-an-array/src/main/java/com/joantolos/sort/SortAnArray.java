package com.joantolos.sort;

public class SortAnArray {

    public int[] selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            swapByIndex(nums, i, min);
        }
        return nums;
    }

    protected int[] swapByElement(int[] a, int p, int q) {
        int pIndex = 0;
        int qIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == p) pIndex = i;
            if (a[i] == q) qIndex = i;
        }
        int oldP = a[pIndex];
        a[pIndex] = a[qIndex];
        a[qIndex] = oldP;

        return a;
    }

    protected int[] swapByIndex(int[] a, int pIndex, int qIndex) {
        int oldP = a[pIndex];
        a[pIndex] = a[qIndex];
        a[qIndex] = oldP;

        return a;
    }

    protected boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) return false;
        }
        return true;
    }
}
