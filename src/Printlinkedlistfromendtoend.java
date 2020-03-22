/**
 * FileName: Printlinkedlistfromendtoend
 * Description:从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回)
 * Author:   @VirtualChen
 * Date:     2020/3/17 20:05
 */
package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Printlinkedlistfromendtoend {
    /**
     * 使用栈实现倒序输出
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head.next != null) {
            stack.add(head.val);
            head = head.next;
        }
        stack.add(head.val);
        int[] ans = new int[stack.size()];
        System.out.println(stack.size());
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.pop();
            System.out.println(ans[i]);
        }
        return ans;

    }
}
