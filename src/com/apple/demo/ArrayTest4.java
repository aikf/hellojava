package com.apple.demo;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest4 {
    public static void main(String[] args) {
        String[] a = {"a", "A", "b", "B"};
        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
