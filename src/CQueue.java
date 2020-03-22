/**
 * FileName: CQueue
 * Description:用两个栈实现队列
 * Author:   @VirtualChen
 * Date:     2020/3/17 21:28
 */
package src;

import java.util.Stack;

public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void appendTail(int value) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.empty() && stack2.empty()) {
            return -1;
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
