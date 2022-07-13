package com.joantolos.two.sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] exponentialAlgorithmBad(int[] nums, int target) {
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

    n = 5 -> 25
    n = 50 -> 2500
    n = 150 -> 22500
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

    public int[] linealAlgorithm(int[] nums, int target) {
        Map<Integer, Integer> lookedUpNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int subtracted = target - nums[i];
            if (lookedUpNums.containsKey(subtracted)) {
                return new int[] { lookedUpNums.get(subtracted), i };
            } else {
                lookedUpNums.put(nums[i], i);
            }
        }
        return null;
    }
}
