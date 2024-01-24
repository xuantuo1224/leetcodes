package com.xuantuo.top150;

public class FindIndex28 {

    public static void main(String[] args) {
        String s1 = "mississippi";
        String s2 = "issipi";
        System.out.println(strStr(s1, s2));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {

            for (int j = 0; j < needle.length(); j++) {
                if ((i + j) > (haystack.length() -1) ||  haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;

    }
}
