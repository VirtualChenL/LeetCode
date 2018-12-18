import java.util.Stack;

/**
 * FileName: EvaluateReversePolishNotation
 * Description: 逆波兰表达式求值
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 下午 3:15
 */

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        /**
         * 报错
         */
     /*   if (tokens.length == 0 || tokens == null) {
            return 0;
        }
        Stack<String> ss = new Stack<>();
        ss.add(tokens[0]);
        int i = 1;
        while (i < tokens.length) {
            if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/") {
                ss.add(tokens[i]);
                i++;
            } else {
                int tem1 = Integer.valueOf(ss.pop());
                int tem2 = Integer.valueOf(ss.pop());
                int tem = 0;
                switch (tokens[i]) {
                    case "+":
                        tem = tem1 + tem2;
                        break;
                    case "-":
                        tem = tem2 - tem1;
                        break;
                    case "*":
                        tem = tem1 * tem2;
                        break;
                    case "/":
                        tem = tem2 / tem1;
                        break;
                    default:
                        break;
                }
                ss.add(String.valueOf(tem));
                i++;
            }
        }
        return Integer.valueOf(ss.peek());
        */
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            String temp = tokens[i];
            if (temp.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if (temp.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
            } else if (temp.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (temp.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.add(Integer.parseInt(temp));
            }
        }
        return stack.pop();
    }
}
