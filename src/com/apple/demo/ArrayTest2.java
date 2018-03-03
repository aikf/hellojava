package com.apple.demo;

import java.util.Arrays;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] a = {"a", "A", "b", "B"};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
