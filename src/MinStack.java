import java.util.Stack;

/**
 * 最小栈
 * @author VirtualChen 
 *
 */
public class MinStack {

	   private Stack<Integer> s1=new Stack<>();
		private Stack<Integer> s2=new Stack<>();
		/** initialize your data structure here. */
	   public MinStack() {}
	    
	    public void push(int x) {
	        s1.push(x);
	        if (s2.isEmpty() || s2.peek() >= x) s2.push(x);
	    }
	    
	    public void pop() {
	        // Cannot write like the following:
	        // if (s2.peek() == s1.peek()) s2.pop();
	        // s1.pop();
	        int x = s1.pop();
	        if (s2.peek() == x) s2.pop();
	    }
	    
	    public int top() {
	        return s1.peek();
	    }
	    
	    public int getMin() {
	        return s2.peek();
	    }
}
