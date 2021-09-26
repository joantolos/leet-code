package com.joantolos.two.sum;

public class TwoSum {

    public int[] exponentialAlgorithm(int[] nums, int target) {
        int[] solution = new int[2];
        boolean found = false;

        for (int i = 0; i < nums.length; i++){
            if (!found) {
                for (int j = 0; j < nums.length; j++){
                    if (!found) {
                        if (i != j && (nums[i] + nums[j] == target)) {
                            solution[0] = i;
                            solution[1] = j;
                            found = true;
                        }
                    }
                }
            }
        }

        return solution;
    }

    public int[] logarithmAlgorithm(int[] nums, int target) {
        int[] solution = new int[2];
        boolean found = false;

        for (int i = 0; i < nums.length; i++){
            if (!found) {
                for (int j = 0; j < nums.length; j++){
                    if (!found) {
                        if (i != j && (nums[i] + nums[j] == target)) {
                            solution[0] = i;
                            solution[1] = j;
                            found = true;
                        }
                    }
                }
            }
        }

        return solution;
    }
}
