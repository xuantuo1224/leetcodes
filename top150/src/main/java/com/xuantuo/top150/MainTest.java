package com.xuantuo.top150;

public class MainTest {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String[] list =  s.split("\\s+");

        System.out.println(list[list.length -1].length());

    }
}
