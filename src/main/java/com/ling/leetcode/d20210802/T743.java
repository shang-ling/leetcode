package com.ling.leetcode.d20210802;

import java.util.Arrays;

/**
 *  给你一个列表 times，表示信号经过 有向 边的传递时间。 times[i] = (ui, vi, wi)，其中 ui 是源节点，vi 是目标节点，
 * wi 是一个信号从源节点传递到目标节点的时间。  现在，从某个节点 K 发出一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点
 * 收到信号，返回 -1。
 * @author: ling
 * @create: 2021-08-02 08:22
 **/
public class T743 {

    /**
     * 无思绪
     * 参照了题解的 Dijkstra（迪杰斯特拉） 算法
     * @param times
     * @param n
     * @param k
     * @return
     */
    public int networkDelayTime(int[][] times, int n, int k) {
        int INF = Integer.MAX_VALUE / 2;
        int[][] g = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(g[i], INF);
        }
        for (int[] t : times) {
            int x = t[0] - 1;
            int y = t[1] - 1;
            g[x][y] = t[2];
        }

        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[k - 1] = 0;
        boolean[] used = new boolean[n];

        for (int i = 0; i < n; i++) {
            int x = -1;
            for (int y = 0; y < n; y++) {
                if (!used[y] && (x == -1 || dist[y] < dist[x])) {
                    x = y;
                }
            }
            used[x] = true;
            for (int y = 0; y < n; y++) {
                dist[y] = Math.min(dist[y], dist[x] + g[x][y]);
            }
        }

        int result = Arrays.stream(dist).max().getAsInt();
        return result == INF ? -1 : result;
    }
}
