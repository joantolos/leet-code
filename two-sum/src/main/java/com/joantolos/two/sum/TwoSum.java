package com.joantolos.two.sum;

import java.util.HashMap;
import java.util.Map;

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
