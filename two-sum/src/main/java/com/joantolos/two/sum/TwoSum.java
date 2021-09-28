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

    public int[] logarithmAlgorithm(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;
    }
}
