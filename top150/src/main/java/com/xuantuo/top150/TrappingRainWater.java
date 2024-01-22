package com.xuantuo.top150;

import java.util.Stack;

public class TrappingRainWater {
    static int result = 0;

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < height.length; i++) {
            if (stack.isEmpty()) {
                stack.add(i);
                continue;
            }

            while (height[i] > height[stack.peek()]) {
                int bottomIndex = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                result += (Math.min(height[i], height[stack.peek()]) - height[bottomIndex]) * (i - stack.peek() - 1);
            }
            stack.add(i);
        }

        System.out.println(result);
    }

}

