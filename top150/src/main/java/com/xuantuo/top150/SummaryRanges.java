package com.xuantuo.top150;

import java.util.LinkedList;
import java.util.List;

public class SummaryRanges {

    private static class Node {
        private String sss;

        public Node(String sss) {
            this.sss = sss;
        }

        public String getSss() {
            return sss;
        }

        public void setSss(String sss) {
            this.sss = sss;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        Node node = new Node("s");
        node.setSss("p");
        //summaryRanges(nums);
        System.out.println(node.getSss());
    }


    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        int begin = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                if (end == i) {
                    result.add(nums[begin] + "->" + nums[end]);
                    begin = -1;
                    end = -1;
                } else {
                    result.add(nums[i] + "");
                }
            } else {
                if (nums[i] == nums[i + 1] - 1) {
                    if (begin == -1) {
                        begin = i;
                    }
                    end = i + 1;
                } else {
                    if (begin == -1) {
                        result.add(nums[i] + "");
                    } else {
                        result.add(nums[begin] + "->" + nums[end]);
                        begin = -1;
                        end = -1;
                    }
                }
            }
        }

        return result;

    }
}
