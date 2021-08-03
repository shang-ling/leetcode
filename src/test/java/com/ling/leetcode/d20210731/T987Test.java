package com.ling.leetcode.d20210731;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T987Test {

    @Test
    public void verticalTraversal() {
        T987 t987 = new T987();
        List<int[]> root1 = Collections.singletonList(new int[]{1, 2, 3, 4, 5, 6, 7});
        TreeNode root = (TreeNode) Arrays.asList(1,2,3,4,5,6,7);

        for (int i = 0; i < root1.size() ; i++) {
            t987.verticalTraversal(root);
            System.out.println(t987);
        }
    }
}
