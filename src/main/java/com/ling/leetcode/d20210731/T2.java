package com.ling.leetcode.d20210731;

/**
 * 逆序存储的两个链表存两整数，要求相加返回相同形式的一个链表
 * @author ling
 * @data 2021-07-31 11:35
 **/
public class T2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            l1 = new ListNode(0);
        if (l2 == null)
            l2 = new ListNode(0);

        int sum = l1.val + l2.val;

        if (sum >= 10){
            sum = sum % 10;
            if (l1.next != null){
                l1.next.val++;
            }else {
                // 否者往下面的空节点存个一进来
                l1.next = new ListNode(1);
            }
        }
        return new ListNode(sum, addTwoNumbers(l1.next, l2.next));
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


