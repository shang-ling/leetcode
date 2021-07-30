package com.ling.leetcode.d20210729;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class T70Test {

    @Test
    public void climbStairs() {
        T70 t70 = new T70();
        assertEquals(1, t70.climbStairs(1));
        assertEquals(2, t70.climbStairs(2));
        assertEquals(3, t70.climbStairs(3));
        assertEquals(1346269,t70.climbStairs(30));
        assertEquals(165580141, t70.climbStairs(40));
    }

    @Test
    public void climbStairs1() {
        T70 t70 = new T70();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        for (int i = 0; i < list.size(); i++) {
            int res = t70.climbStairs(list.get(i));
            System.out.print(res + " ");

        }

        //
        // int n = 30;
        // int result = t70.climbStairs(n);
        // System.out.println(result);
    }

    @Test
    public void climbStairs2() {
        T70 t70 = new T70();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        for (int i = 0; i < list.size(); i++) {
            int res = t70.climbStairs2(list.get(i));
            System.out.print(res + " ");

        }

    }

}
