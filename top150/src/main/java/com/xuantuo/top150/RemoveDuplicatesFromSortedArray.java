package com.xuantuo.top150;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    // solution1
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            nums[flag] = nums[i];
            flag++;
            set.add(nums[i]);
        }
        return flag;
    }

    //solution2
    public int removeDuplicates2(int[] nums) {
        int flag = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[flag - 1] != nums[i]) {
                nums[flag] = nums[i];
                flag++;
            }
        }
        return flag;
    }
}
