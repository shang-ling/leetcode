package com.ling.leetcode.d20210801;

import org.junit.Test;

public class T4Test {

    @Test
    public void findMedianSortedArrays() {
        T4 t4 = new T4();
        int[] num1 = {1,3}, num2 = {2};

        double s = t4.findMedianSortedArrays(num1, num2);
        System.out.println(s);
    }

    @Test
    public void findMedianSortedArrays2() {
        T4 t4 = new T4();
        int[] num1 = {1, 2}, num2 = {3, 4};

        double s = t4.findMedianSortedArrays(num1, num2);
        System.out.println(s);
    }
}
