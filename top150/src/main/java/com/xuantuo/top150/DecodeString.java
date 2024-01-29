package com.xuantuo.top150;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        String s = "3[a]2[bc]ef";
        String s1 = "3[a2[c]]";
    }


    public static String decodeString(String s) {
        String result = "";
        Stack<Character> inputStack = new Stack();
        Stack<Character> tempStack = new Stack();

        int flag = 0;  // 1 数字 2 字符串
        int times = 0;
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (k >= '0' || k <= '9' && flag < 2) {
                tempStack.add(k);
            } else if (k == '[') {

            }

            result += k;
        }
        return "";

    }
}
