package com.joantolos.two.sum;

public class TwoSum {

    public int[] exponentialAlgorithm(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i != j && (nums[i] + nums[j] == target)) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    public int[] logarithmAlgorithm(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i != j && (nums[i] + nums[j] == target)) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
