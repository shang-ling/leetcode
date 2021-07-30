package com.ling.leetcode.d20210726;

/**
 * @program: LeetCode_Brush_Questions
 * @description: 给一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * @author: ling
 * @create: 2021-07-25 23:07
 **/
public class T19RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 定义快慢两个指针
        ListNode fast = head;
        ListNode slow = head;

        // 快指针先走n个节点，然后快慢指针同步进行
        for (int count = 0; count < n; count++){
            fast = fast.next;
        }

        if (fast == null){
            return slow.next;
        }

        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        // 结束时删除，慢指针指向下下个
        slow.next = slow.next.next;

        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(ListNode next) {
            this.next = next;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(Integer val) {
             this.val = val;
        }
    }

}
