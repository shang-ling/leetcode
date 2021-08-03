package com.ling.leetcode.d20210731;

import java.util.*;

/**
 * 给出二叉树的根结点 root ，设计算法计算二叉树的 垂序遍历 序列。
 * 思路： 将这个二叉树遍历，后通过覆写Comparator接口进行多关键排序，最后遍历（循环）输出结果
 * @author ling
 * @date 2021-07-31 08:50
 **/
public class T987 {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        int size = 0;
        // 输入和输出(与返回的类型一致)的结果
        List<int[]> nodes = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        // 遍历输入的二叉树nodes
        traverse(root, 0, 0, nodes);

        // 覆写Comparator接口对遍历结果进行多关键字排序
        Collections.sort(nodes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 因为nodes按 col, row, value三个关键字存放
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                }else if (o1[1] != o2[1]) {
                    return o1[1] - o2[1];
                }else
                    return o1[2] - o2[2];
            }
        });

        //遍历输出结果
        int lastcol = Integer.MIN_VALUE;

        for (int[] o3 : nodes){
            //先按列来，
            int col = o3[0];
            int row = o3[1];
            int val = o3[2];
            if (col != lastcol) {
                lastcol = col;
                result.add(new ArrayList<Integer>());
                size++;
            }
            result.get(size - 1).add(val);
        }
        return result;
    }

    private void traverse(TreeNode root, int row, int col, List<int[]> nodes) {
        // 判断树空与否，否则将节点和值存进nodes里
        if (root == null) {
            return;
        }else {
            nodes.add(new int[]{col, row, root.val});
        }
        traverse(root.left, row + 1, col - 1, nodes);
        traverse(root.right, row + 1, col + 1, nodes);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() { }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}