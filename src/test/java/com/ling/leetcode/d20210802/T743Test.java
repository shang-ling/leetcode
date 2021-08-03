package com.ling.leetcode.d20210802;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T743Test {

    @Test
    public void networkDelayTime1() {
        T743 t743 = new T743();
        int[][] times = {{2,1,1}, {2,3,1}, {3,4,1}};

        int t = t743.networkDelayTime(times, 4, 2);
        System.out.println(t);
    }

    @Test
    public void networkDelayTime2() {
        T743 t743 = new T743();
        int[][] times = {{1, 2, 1}};

        int t = t743.networkDelayTime(times, 2, 1);
        System.out.println(t);
    }

    @Test
    public void networkDelayTime3() {
        T743 t743 = new T743();
        int[][] times = {{1, 2, 1}};

        int t = t743.networkDelayTime(times, 2, 2);
        System.out.println(t);
    }

    @Test
    public void networkDelayTime4() {
        T743 t743 = new T743();
        int[][] times = {{2,1,1}, {2,3,1}, {3,4,1}};
        assertEquals(2, t743.networkDelayTime(times, 4, 2));
    }
}
