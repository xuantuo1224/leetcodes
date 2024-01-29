package com.xuantuo.top150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {

    static class Pair {
        int first;
        int second;
        int total;

        public Pair(int first, int second, int total) {
            this.first = first;
            this.second = second;
            this.total = total;
        }

        public int getFirst() {
            return first;
        }

        public void setFirst(int first) {
            this.first = first;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};

        boolean[] test = new boolean[2];

        System.out.println(test);

        List<List<Integer>> result = new LinkedList<>();

        int k = 3;

        PriorityQueue<Pair> heap = new PriorityQueue<>(((o1, o2) -> o1.getTotal() - o2.getTotal()));

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                Pair pair = new Pair(nums1[i], nums2[j], nums1[i] + nums2[j]);
                heap.offer(pair);
            }
        }

        for (int i = 0; i < k; i++) {
            if (!heap.isEmpty()) {
                Pair pair = heap.poll();
                List<Integer> newOne = new ArrayList<>(2);
                newOne.add(pair.getFirst());
                newOne.add(pair.getSecond());
                result.add(newOne);
            }
        }

        System.out.println(result.toString());


    }
}
