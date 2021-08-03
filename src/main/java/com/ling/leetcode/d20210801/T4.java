package com.ling.leetcode.d20210801;

/**
 * @program: leetcode
 * @description: 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2;找出并返回这两个正序数组的 中位数
 * @author: ling
 * @create: 2021-08-01 11:09
 **/
public class T4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] sum = new int[n1 + n2];
        int sumlen = n1 + n2;
        int count = 0, nn1 = 0, nn2 = 0;

        if (nums1 == null)
            sum = nums2;
        if (nums2 == null)
            sum = nums1;

        while (count != sumlen) {
            //判断数组是否把数取完了，取完了就把另一数组的数全给sum
            if (nn1 == n1) {
                while (nn2 != n2) {
                    sum[count++] = nums2[nn2++];
                }
                break;
            }
            if (nn2 == n2) {
                while (nn1 != n1) {
                    sum[count++] = nums1[nn1++];
                }
                break;
            }
            //判断两数组哪个取出来的数小，小的先赋值给sum
            if (nums1[nn1] < nums2[nn2]) {
                sum[count++] = nums1[nn1++];
            }else
                sum[count++] = nums2[nn2++];
        }

        double result;

        if (count % 2 != 0) {
            result =  sum[count / 2];
        }else {
            n2 = count / 2 - 1;
            result = (sum[count / 2] + sum[n2]) / 2.0;
        }
        return result;
    }
}
