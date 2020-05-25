package src; /**
 * 链表的中间节点
 *
 * @author Administrator
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode p = head;
        ListNode q = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        if (len == 1)
            return head;
        else {
            if (len % 2 == 1) {
                for (int i = 0; i < Math.ceil(len / 2); i++)
                    q = q.next;
                return q;
            } else {
                for (int i = 0; i < len / 2; i++)
                    q = q.next;
                return q;
            }
        }
    }

    public ListNode middleNode2(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        int k = 0;
        while (p != null && p.next != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }
}
