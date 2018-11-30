import java.util.Stack;

/**
 * 有效的括号
 * @author VirtualChen 
 *
 */
public class ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(stack.peek()=='(' && s.charAt(i)==')'){
                stack.pop();
            }else if(stack.peek()=='[' && s.charAt(i)==']'){
                stack.pop();
            }else if(stack.peek()=='{' && s.charAt(i)=='}'){
                stack.pop();
            }else{
               stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();

    }
}
