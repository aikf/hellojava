package com.apple.demo;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] a = {9,8,1,13,3,7,5,0};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
