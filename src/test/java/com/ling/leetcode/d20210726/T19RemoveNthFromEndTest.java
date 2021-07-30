package com.ling.leetcode.d20210726;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class T19RemoveNthFromEndTest {


    @Test
    public void removeNthFromEnd() {
        T19RemoveNthFromEnd t19RemoveNthFromEnd = new T19RemoveNthFromEnd();
        T19RemoveNthFromEnd.ListNode node5 = new T19RemoveNthFromEnd.ListNode(5, null);
        T19RemoveNthFromEnd.ListNode node4 = new T19RemoveNthFromEnd.ListNode(4, node5);
        T19RemoveNthFromEnd.ListNode node3 = new T19RemoveNthFromEnd.ListNode(3, node4);
        T19RemoveNthFromEnd.ListNode node2 = new T19RemoveNthFromEnd.ListNode(2, node3);
        T19RemoveNthFromEnd.ListNode node1 = new T19RemoveNthFromEnd.ListNode(1, node2);

        T19RemoveNthFromEnd.ListNode head = node1;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        T19RemoveNthFromEnd.ListNode head1 = buildNode(list);
        printListNode(head1);

        System.out.println();

        T19RemoveNthFromEnd.ListNode head2 = t19RemoveNthFromEnd.removeNthFromEnd(head1, 5);
        printListNode(head2);
    }

    @Test
    public void removeNthFromEnd2() {
        T19RemoveNthFromEnd t19RemoveNthFromEnd = new T19RemoveNthFromEnd();
        T19RemoveNthFromEnd.ListNode node5 = new T19RemoveNthFromEnd.ListNode(5, null);
        T19RemoveNthFromEnd.ListNode node4 = new T19RemoveNthFromEnd.ListNode(4, node5);
        T19RemoveNthFromEnd.ListNode node3 = new T19RemoveNthFromEnd.ListNode(3, node4);
        T19RemoveNthFromEnd.ListNode node2 = new T19RemoveNthFromEnd.ListNode(2, node3);
        T19RemoveNthFromEnd.ListNode node1 = new T19RemoveNthFromEnd.ListNode(1, node2);

        T19RemoveNthFromEnd.ListNode head = node1;
        List<Integer> list = Arrays.asList(1);
        T19RemoveNthFromEnd.ListNode head1 = buildNode(list);
        printListNode(head1);

        System.out.println();

        T19RemoveNthFromEnd.ListNode head2 = t19RemoveNthFromEnd.removeNthFromEnd(head1, 1);
        printListNode(head2);
    }

    @Test
    public void removeNthFromEnd3() {
        T19RemoveNthFromEnd t19RemoveNthFromEnd = new T19RemoveNthFromEnd();
        T19RemoveNthFromEnd.ListNode node5 = new T19RemoveNthFromEnd.ListNode(5, null);
        T19RemoveNthFromEnd.ListNode node4 = new T19RemoveNthFromEnd.ListNode(4, node5);
        T19RemoveNthFromEnd.ListNode node3 = new T19RemoveNthFromEnd.ListNode(3, node4);
        T19RemoveNthFromEnd.ListNode node2 = new T19RemoveNthFromEnd.ListNode(2, node3);
        T19RemoveNthFromEnd.ListNode node1 = new T19RemoveNthFromEnd.ListNode(1, node2);

        T19RemoveNthFromEnd.ListNode head = node1;
        List<Integer> list = Arrays.asList(1, 2);
        T19RemoveNthFromEnd.ListNode head1 = buildNode(list);
        printListNode(head1);

        System.out.println();

        T19RemoveNthFromEnd.ListNode head2 = t19RemoveNthFromEnd.removeNthFromEnd(head1, 1);
        printListNode(head2);
    }

    private T19RemoveNthFromEnd.ListNode buildNode(List<Integer> list) {
        T19RemoveNthFromEnd.ListNode root = new T19RemoveNthFromEnd.ListNode();
        root.val = list.get(0);
        T19RemoveNthFromEnd.ListNode other = root;
        for (int i = 1; i < list.size(); i++) {
            T19RemoveNthFromEnd.ListNode temp = new T19RemoveNthFromEnd.ListNode();
            temp.val = list.get(i);

//            T19RemoveNthFromEnd.ListNode temp2 = new T19RemoveNthFromEnd.ListNode(list.get(i));
//
//            T19RemoveNthFromEnd.ListNode temp3 = new T19RemoveNthFromEnd.ListNode(list.get(i), null);


            other.next = temp;
            other = temp;
        }
        return root;
    }

    public void  printListNode(T19RemoveNthFromEnd.ListNode listNode) {
        while (listNode != null) {
//            System.out.println(listNode.val + " ");
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

}