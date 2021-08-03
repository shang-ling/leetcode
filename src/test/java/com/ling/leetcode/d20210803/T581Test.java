package com.ling.leetcode.d20210803;

import org.junit.Test;

import java.util.Arrays;

public class T581Test {

    @Test
    public void findUnsortedSubarray1() {
        int[] nums = {2, 6, 4, 8, 10, 9, 15};

        T581 t581 = new T581();
        int len = t581.findUnsortedSubarray(nums);
        System.out.println(len);
    }

    @Test
    public void findUnsortedSubarray2() {
        int[] nums = {1, 2, 3, 4};

        T581 t581 = new T581();
        int len = t581.findUnsortedSubarray(nums);
        System.out.println(len);
    }

    @Test
    public void findUnsortedSubarray3() {
        int[] nums = {1};

        T581 t581 = new T581();
        int len = t581.findUnsortedSubarray(nums);
        System.out.println(len);
    }

    @Test
    public void findUnsortedSubarray4() {
        int[] nums = {1, 2, 3, 4};
        int[] numsSort = Arrays.copyOf(nums, nums.length);

        Arrays.sort(numsSort);

        System.out.println(nums.equals(numsSort) ? "相等" : "不相等");
        System.out.println(nums == numsSort ? "相等" : "不相等");
        System.out.println(numsSort);
        System.out.println(nums);
    }
}
