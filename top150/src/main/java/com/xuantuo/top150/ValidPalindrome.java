package com.xuantuo.top150;

public class ValidPalindrome {

    public static void main(String[] args) {

        String temp = "race a car";
        System.out.println(isPalindrome(temp));
    }

    public static boolean isPalindrome(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                temp += s.charAt(i);
            }
        }

        if (temp.length() < 2) {
            return true;
        }

        temp = temp.toLowerCase();

        int i = 0;
        int j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
