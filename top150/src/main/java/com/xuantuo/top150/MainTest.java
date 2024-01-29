package com.xuantuo.top150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainTest {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String[] list = s.trim().split("\\s+");


        Node no1 = new Node();
        no1.setValue(1);
        Node no2 = new Node();
        no2.setValue(2);
        Node[] n = new Node[2];
        n[0] = no1;
        n[1] = no2;

        Arrays.sort(n, ((o1, o2) -> o2.getValue() - o1.getValue()));


        System.out.println(list[list.length - 1].length());

        System.out.println(s);

        System.out.println(s.trim());

    }

    public static int solution(int[] A) {
        // Implement your solution here
        Set<Integer> tempSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                tempSet.add(A[i]);
            }
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!tempSet.contains(i)) {
                return i;
            }
        }

        return Integer.MAX_VALUE;
    }
}
