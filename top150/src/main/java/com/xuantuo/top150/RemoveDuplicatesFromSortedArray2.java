package com.xuantuo.top150;

public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int flag = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[flag] && nums[i] == nums[flag - 1]) {
                continue;
            }
            nums[++flag] = nums[i];
        }
        return flag + 1;
    }


    public int removeDuplicates2(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int flag = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[flag - 1]) {
                continue;
            }
            nums[++flag] = nums[i];
        }
        return flag + 1;
    }

}
