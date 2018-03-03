package com.apple.demo;

import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        String [] a = {"a", "C", "b", "D"};
        Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
