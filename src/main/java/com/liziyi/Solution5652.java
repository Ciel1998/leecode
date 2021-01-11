package com.liziyi;

import lombok.val;

import java.util.List;

/**
 * @version 1.0
 * @Description
 * @Author liziyi
 * @CreateDate 2021/1/10 10:57
 * @UpdateUser
 * @UpdateDate
 * @UpdateRemark
 */

public class Solution5652 {
    public ListNode swapNodes(ListNode head, int k) {
        //快节点，最后遍历整个链表
        ListNode quickPoint = head;
        //慢节点，最后到倒数第k个
        ListNode slowPoint = head;
        //正数第k个节点
        ListNode indexK = head;
        int n = 1;
        while (quickPoint.next != null) {
            if (n < k) {
                // 在第k个停下，正好是正数第k个
                indexK = indexK.next;
            } else {
                // 当快指针到达终点时，慢指针和快指针正好相差k个。即到达倒数第k个的位置
                slowPoint = slowPoint.next;
            }
            quickPoint = quickPoint.next;
            n++;
        }
        int temp = indexK.val;
        indexK.val = slowPoint.val;
        slowPoint.val = temp;
        return head;
}

    public static void main(String[] args) {
        //定义链表，没有用这种方法进行测试
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next = new ListNode(4);
        node.next.next.next = new ListNode(5);
        Solution5652 solution5652 = new Solution5652();
        solution5652.swapNodes(node, 2);
    }
}


