package com.ling.leetcode.d20210803;

import java.util.Arrays;

/**
 * 找出数组中的连续子数组（对子数组升序，整个数组都会变为升序），并输出长度
 * @author li wenke
 * @date 2021-08-03
 */
public class T581 {

    /**
     * 排序后对比两个数组的区别，判断不同的起始
     * @param nums 给出的数组
     * @return right - left +1
     */
    public int findUnsortedSubarray(int[] nums) {
        // 这样numsSort改了也会导致nums也改
        // int[] numsSort = nums;
        int[] numsSort = Arrays.copyOf(nums, nums.length);

        Arrays.sort(numsSort);

        /*if (numsSort == nums) {
            return 0;
        }*/

        // 定义左右两个指针，来确定不一样的地方
        int left = 0;
        int right = nums.length - 1;

        while (left <= right && numsSort[left] == nums[left]) {
            left++;
        }

        while (left <= right && numsSort[right] == nums[right]) {
            right--;
        }
        // 因为指针是从0开始数的
        return right - left + 1;
    }
}
