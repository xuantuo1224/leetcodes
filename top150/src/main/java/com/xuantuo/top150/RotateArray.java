package com.xuantuo.top150;

import com.alibaba.fastjson2.JSONObject;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,7);
        System.out.println(JSONObject.toJSONString(nums));
    }


    public static void rotate(int[] nums, int k) {
        int[] front = new int[k];
        int totalSize = nums.length;
        while(k > totalSize){
            k = k%totalSize;
        }
        for(int i=0;i<k;i++){
            front[i] = nums[totalSize-k+i];
        }
        for(int i=totalSize;i > k;i--){
            nums[i-1] = nums[i-k-1];
        }
        for(int i=0;i<k;i++){
            nums[i] = front[i];
        }
    }
}