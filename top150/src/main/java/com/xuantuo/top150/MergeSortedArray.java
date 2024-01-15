package com.xuantuo.top150;

import com.alibaba.fastjson2.JSONObject;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(num1, 3, nums2, 3);
        System.out.println(JSONObject.toJSONString(num1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int flag = m + n - 1;
        while (m > 0 || n > 0) {
            if (0 == m) {
                nums1[flag] = nums2[n - 1];
                n--;
            } else if (0 == n) {
                nums1[flag] = nums1[m - 1];
                m--;

            } else {
                if (nums2[n - 1] > nums1[m - 1]) {
                    nums1[flag] = nums2[n - 1];
                    n--;
                } else {
                    nums1[flag] = nums1[m - 1];
                    m--;
                }
            }
            flag--;
        }
    }
}
