package com.xuantuo.top150;

import java.util.Arrays;
import java.util.List;

public class BestTimeToBuyAndSellStock2 {
    public static void main(String[] args) {

        String s = "  hello world  ";
        String ss = "";
        String[] s1 = s.split(" ");
        boolean isFirst = true;
        for (int i = s1.length -1; i >= 0; i--) {
            if(!s1[i].isEmpty()){
                if(isFirst){
                    ss += (s1[i]);
                    isFirst = false;
                }else{
                    ss += (" " + s1[i]);
                }

            }
        }
        System.out.println(ss);

    }
}
