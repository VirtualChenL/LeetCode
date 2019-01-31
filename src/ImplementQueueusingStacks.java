import java.util.Stack;

/**
 * 用栈实现队列
 * @author VirtualChen
 *
 */
class MyQueue {
	Stack<Integer> s1,s2; 

    /** Initialize your data structure here. */
    public MyQueue() {
    	s1=new Stack<>();
    	s2=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
       while(!s2.isEmpty()) {
    	   s1.push(s2.peek());
    	   s2.pop();
       }
       s2.push(x);
       while(!s1.isEmpty()) {
    	   s2.push(s1.peek());
    	   s1.pop();
       }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int a=s2.peek();
        s2.pop();
        return a;
    }
    
    /** Get the front element. */
    public int peek() {
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
