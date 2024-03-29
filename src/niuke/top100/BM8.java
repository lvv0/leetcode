package niuke.top100;

import leetcode.ListNode;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class BM8 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param pHead ListNode类
     * @param k     int整型
     * @return ListNode类
     */
    public ListNode FindKthToTail(ListNode pHead, int k) {
        if (pHead == null) {
            return null;
        }
        // write code here
        ListNode p = pHead;
        ListNode q = pHead;
        while (--k > 0 && p.next != null) {
            p = p.next;
        }
        if (k != 0) {
            return null;
        }
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }
}
