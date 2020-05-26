/**
 * FileName: Reverselinkedlist2
 * Description: 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 * Author:   @VirtualChen
 * Date:     2020/3/28 21:07
 */
package src;

import java.util.List;
import java.util.Stack;

public class Reverselinkedlist2 {
    /**
     * 超时
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head.next != null) {
            stack.add(head);
            head = head.next;
            System.out.println("1111");
        }
        ListNode p = head;
        while (!stack.isEmpty()) {
            p.next = stack.pop();
            p = p.next;
            System.out.println(stack.size());
        }
        return head;
    }

    /**
     * 需要三个指针分别保存当前节点,前一个结点和后一个节点
     * 迭代实现
     *
     * @param head
     * @return
     */
    public ListNode reverseLis2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    /**
     * 递归实现
     * @param head
     * @return
     */
    public ListNode reverseLis3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
