/**
 * FileName: RotateList
 * Description: 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数
 * Author:   @VirtualChen
 * Date:     2020/5/25 19:54
 */
package src;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode l = head;
        int len = 0;
        while (l != null) {
            len++;
            l = l.next;
        }
        if (len == 0) {
            return head;
        }
        k = k % len;//需要考虑长度为0的情况,以及K超过长度的情况
        if (k == 0) {
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        for (int i = 0; i < k; i++) {
            p = p.next;
        }
        while (p.next != null) {
            p = p.next;
            q = q.next;

        }
        ListNode res = q.next;
        p.next = head;
        q.next = null;
        return res;
    }
}
