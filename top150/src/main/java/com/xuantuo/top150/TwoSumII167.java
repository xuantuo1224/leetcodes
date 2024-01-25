package com.xuantuo.top150;

public class TwoSumII167 {

    public static void main(String[] args) {


        int[] result = new int[2];

    }

    public static int[] twoSum(int[] numbers, int target) {



        int[] result = new int[2];

        for(int left = 0,right = numbers.length -1;;){
            if(numbers[left] + numbers[right] == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }

            if(numbers[left] + numbers[right] > target){
                right--;
            }

            if(numbers[left] + numbers[right] < target){
                right = (right+1) >= numbers.length ? right : right+1;
                left++;
            }
        }
    }
}
