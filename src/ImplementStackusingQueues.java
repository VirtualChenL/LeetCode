import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * FileName: ImplementStackusingQueues
 * Description: 用队列实现栈
 * Author:   @VirtualChen
 * Date:     2019/2/26 0026 上午 9:05
 */

public class MyStack {
    private Deque<Object> queue;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue=new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.addFirst(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int a = (int) queue.pop();
        return a;
    }

    /**
     * Get the top element.
     */
    public int top() {
        int b = (int) queue.peek();
        return b;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
