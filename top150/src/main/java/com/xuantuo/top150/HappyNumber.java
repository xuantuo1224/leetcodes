package com.xuantuo.top150;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        int n = 19;

        Set<Integer> set1 = new HashSet<>();
        while(true){
            if(set1.contains(n)){
                System.out.println(false);
            }else{
                set1.add(n);
            }

            if(n < 10){
                if(1 == n){
                    System.out.println(true);
                }
                n = n*n;
            }else{
                int temp = 0;
                while(n > 0){
                    temp += (n % 10) * (n % 10);
                    n = n/10;
                }
                n = temp;
            }
        }

    }
}
