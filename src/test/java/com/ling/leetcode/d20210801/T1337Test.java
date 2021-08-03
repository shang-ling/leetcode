package com.ling.leetcode.d20210801;

import org.junit.Test;

public class T1337Test {

    @Test
    public void kWeakestRows1() {
        T1337 t1337 = new T1337();
        int[][] a = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int[] s = t1337.kWeakestRows(a, 3);

        for (int i = 0; i < s.length ; i++) {
            System.out.print(s[i] + " ");
        }
    }

    @Test
    public void kWeakestRows2() {
        T1337 t1337 = new T1337();
        int[][] a = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        int[] s = t1337.kWeakestRows(a, 2);

        for (int i = 0; i < s.length ; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
