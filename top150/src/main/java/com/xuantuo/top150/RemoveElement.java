package com.xuantuo.top150;

import com.alibaba.fastjson2.JSONObject;

public class RemoveElement {

    public static void main(String[] args) {
        int[] num1 = {3,2,2,3};

        removeElement(num1, 3);
        System.out.println(JSONObject.toJSONString(num1));
    }

    public static int removeElement(int[] nums, int val) {
        int last = nums.length -1;
        int num = 0;
        for(int i = 0; i<= last;i++){
            if(nums[i] == val){
                num++;
                while(last > i){
                    if(nums[last] != val){
                        nums[i] = nums[last];
                        last--;
                        break;
                    }else{
                        num++;
                        last--;
                    }
                }
            }
        }
        return nums.length - num;
    }

}
