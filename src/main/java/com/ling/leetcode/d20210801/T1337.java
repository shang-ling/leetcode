package com.ling.leetcode.d20210801;

import java.util.*;

/**
 * @program: leetcode
 * @description: 给一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序
 * @author: ling
 * @create: 2021-08-01 08:09
 **/
public class T1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> list = new ArrayList<int[]>();
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; ++i) {
            // int count = 0;
            // for (int j = 0; j <= n; ++j) {
            //     // java.lang.ArrayIndexOutOfBoundsException: 5
            //     int a = mat[i][j];
            //     if (a == 1) {
            //         count++;
            //     }
            // }
            int l = 0, r = n - 1, pos = -1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (mat[i][mid] == 0) {
                    r = mid - 1;
                } else {
                    pos = mid;
                    l = mid + 1;
                }
            }

            list.add(new int[]{pos, i});
        }

        // 多关键字排序根据战力和索引两
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] pair1, int[] pair2) {
                if (pair1[0] != pair2[0]) {
                    return pair1[0] - pair2[0];
                } else {
                    return pair1[1] - pair2[1];
                }
            }
        });

        for (int[] pair : list) {
            priorityQueue.offer(pair);
        }

        // 定义一个结果数组,长度为k
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll()[1];
        }
        return result;
    }

    public int[] kWeakestRows2(int[][] mat, int k) {
        int[] result = null;
        int count = 0;
        // 用ArrayList来存战力及其索引
        ArrayList<int[]> list = new ArrayList<>();

        for (int m = 0; m <= mat.length; m++) {
            //返回的索引就是这个 m
            for (int n = 0; n < mat[0].length; n++) {
                //定义一个战斗力的计数器
                if (mat[m][n] == 1) {
                    count++;
                }
                break;
            }
            list.add(new int[]{m, count});
        }

        return result;
    }
}
