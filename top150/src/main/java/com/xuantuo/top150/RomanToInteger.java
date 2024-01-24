package com.xuantuo.top150;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static Map<Character, Integer> cMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static void main(String[] args) {

        String s = "MCMXCIV";

        int result = 0;

        int length = s.length();
        System.out.println(s.charAt(length - 1));
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1 < s.length()) && cMap.get(s.charAt(i + 1)) > cMap.get(s.charAt(i))) {
                result += (cMap.get(s.charAt(i + 1)) - cMap.get(s.charAt(i)));
                i++;
            } else {
                result += cMap.get(s.charAt(i));
            }

        }

        System.out.println(result);


    }


}
