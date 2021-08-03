package com.ling.leetcode.d20210731;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class T2Test {

    @Test
    public void addTwoNumbers() {
        List<Integer> list1 = Arrays.asList(2,4,3);
        List<Integer> list2 = Arrays.asList(5,6,4);

        T2.ListNode l1 = bulidNode(list1);
        T2.ListNode l2 = bulidNode(list2);

        T2 result = new T2();
        result.addTwoNumbers(l1, l2);
        printListNode(result.addTwoNumbers(l1,l2));
        System.out.print(result.addTwoNumbers(l1, l2));
    }

    private T2.ListNode bulidNode(List<Integer> list1) {
        T2.ListNode root = new T2.ListNode();
        root.val = list1.get(0);
        T2.ListNode other = root;
        for (int i = 0; i < list1.size(); i++) {
            T2.ListNode temp = new T2.ListNode(list1.get(i));
            other.next = temp;
            other = temp;
        }
        return root;
    }

    public void  printListNode(T2.ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

}
