package com.xuantuo.top150;

import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelf {
    static Map<Integer, Integer> leftMap = new HashMap<>();
    static Map<Integer, Integer> rightMap = new HashMap<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftValue(i - 1, nums) * rightValue(i + 1, nums);
        }

        System.out.println(result);
    }

    public static int leftValue(int i, int[] nums) {
        if (i < 0) {
            return 1;
        } else if (i == 0) {
            return nums[i];
        }

        if (leftMap.containsKey(i)) {
            return leftMap.get(i);
        }

        int result = nums[i] * leftValue(i - 1, nums);
        leftMap.put(i, result);
        return result;
    }

    public static int rightValue(int i, int[] nums) {
        if (i > nums.length - 1) {
            return 1;
        } else if (i == nums.length - 1) {
            return nums[i];
        }

        if (rightMap.containsKey(i)) {
            return rightMap.get(i);
        }

        int result = nums[i] * rightValue(i + 1, nums);
        rightMap.put(i, result);
        return result;
    }

}
