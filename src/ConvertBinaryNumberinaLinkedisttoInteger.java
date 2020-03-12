/**
 * FileName: ConvertBinaryNumberinaLinkedisttoInteger
 * Description: 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。  请你返回该链表所表示数字的 十进制值
 * Author:   @VirtualChen
 * Date:     2020/2/21 21:40
 */
package src;

import java.util.Stack;

public class ConvertBinaryNumberinaLinkedisttoInteger {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        int k = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        while (head.next != null) {
            stack.push(head.next.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            ans += stack.pop() * Math.pow(2, k++);
        }
        return ans;
    }
}
