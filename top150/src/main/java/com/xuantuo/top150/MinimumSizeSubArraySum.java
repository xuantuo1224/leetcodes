package com.xuantuo.top150;

import java.util.Arrays;

public class MinimumSizeSubArraySum {

    public static void main(String[] args) {
        int[] nums = {12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        minSubArrayLen(213,nums);
    }

    public static int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;


        int temp = 0;
        for (int i = n - 1; i >= 0; i--) {
            temp += nums[i];
            if (temp >= target) {
                return n - i;
            }
        }

        return 0;
    }
}
