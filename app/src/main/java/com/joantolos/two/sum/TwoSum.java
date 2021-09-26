package com.joantolos.two.sum;

public class TwoSum {

    public int[] exponentialAlgorithm(int[] nums, int target) {
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i != j && (nums[i] + nums[j] == target)) {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }

        return solution;
    }

    public int[] logarithmAlgorithm(int[] nums, int target) {
        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i != j && (nums[i] + nums[j] == target)) {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }

        return solution;
    }
}
