/**
 * FileName: Thestackcontainingtheminunction
 * Description: 包含min函数的栈
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)
 * Author:   @VirtualChen
 * Date:     2020/3/31 21:38
 */
package src;

import java.util.Stack;

/**
 * 使用两个栈实现，一个保存入栈数字，一个保存当前最小值
 */
public class Thestackcontainingtheminunction {
    /**
     * initialize your data structure here.
     */
    Stack<Integer> stack;
    Stack<Integer> stack2;

    public Thestackcontainingtheminunction() {
        stack = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!stack2.isEmpty()) {
            stack2.push(x > stack2.peek() ? stack2.peek() : x);
        } else {
            stack2.push(x);
        }
    }

    public void pop() {
        stack.pop();
        stack2.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stack2.peek();
    }
}

