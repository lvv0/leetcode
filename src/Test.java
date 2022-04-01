
import leetcode.LinkedListUtils;
import leetcode.ListNode;

import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */

public class Test {
    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;
        System.out.println(a==b);
        System.out.println(c==d);

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
    }

    /**
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public static boolean isPail(ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return true;
        }
        ListNode p = head;
        List<Integer> list = new ArrayList<>();
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        for (int i = 0; i < list.size() / 2; i++) {
            Integer n1 = list.get(i);
            Integer n2 = list.get(list.size() - 1 - i);
            if (!n1.equals(n2)) {
                return false;
            }
        }
        return true;
    }
}