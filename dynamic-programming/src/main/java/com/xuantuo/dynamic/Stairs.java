//package com.xuantuo.dynamic;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//public class Stairs {
//
//    public static int nums = 0;
//
//    public static void main(String[] args) {
//        List<Integer> choices = Arrays.asList(1, 2);
//        HashSet<Object> objects = new HashSet<>();
//        objects.add()
//        dfs(choices, 0, 3);
//
//        System.out.println(nums);
//    }
//
//    public boolean isValidSudoku(char[][] board) {
//        for(int i=0;i < 9;i++){
//            Set<Char> tempSet = new HashSet<>();
//            for(int j =0;j < 9 ;j++){
//                if(board[i][j] != '.'){
//                    if(tempSet.contains(board[i][j])){
//                        return false;
//                    }
//                    tempSet.add(board[i][j]);
//                }
//            }
//        }
//
//        for(int i=0,j=0;j<height.length,j++ ){
//
//        }
//
//        return true;
//    }
//
//
//    public static void dfs(List<Integer> choices, int pos, int n) {
//        if (pos == n) {
//            nums++;
//            return;
//        }
//
//        for (Integer i : choices) {
//            if (pos + i > n) {
//                continue;
//            }
//            dfs(choices, pos + i, n);
//        }
//    }
//}
