import java.util.Stack;

/**
 * FileName: BaseballGame
 * Description: 棒球比赛
 * Author:   @VirtualChen
 * Date:     2018/12/26 0026 下午 3:48
 */

public class BaseballGame {
    public int calPoints(String[] ops) {
        if (ops == null || ops.equals(null)) {
            return 0;
        }
        int answer = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals( "+")) {
                String temp1 = stack.pop();
                String temp2 = stack.peek();
                int aa = Integer.valueOf(temp1) + Integer.valueOf(temp2);
                stack.push(temp1);
                stack.push(String.valueOf(aa));
            } else if (ops[i].equals( "D")) {
                String temp3 = stack.peek();
                int bb = Integer.valueOf(temp3) * 2;
                stack.push(String.valueOf(bb));
            } else if (ops[i].equals("C")) {
                stack.pop();
            }else{
                stack.push(ops[i]);
            }
        }
        while (!stack.empty()) {
            answer += Integer.valueOf(stack.pop());
        }
        return answer;
    }
}
