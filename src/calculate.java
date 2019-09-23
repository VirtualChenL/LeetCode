import java.util.Stack;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/20 10:45
 * @Description:实现一个基本的计算器来计算一个简单的字符串表达式的值。 字符串表达式仅包含非负整数，+， - ，*，/ 四种运算符和空格  。 整数除法仅保留整数部分。
 */
public class calculate {
    public static int calculate(String s) {
        int res = 0, num = 0, n = s.length();
        char op = '+';
        Stack<Integer> sta = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) >= '0') {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (s.charAt(i) < '0' && s.charAt(i) != ' ' || i == n - 1) {
                if (op == '+') {
                    sta.push(num);
                }
                if (op == '-') {
                    sta.push(-num);
                }
                if (op == '*' || op == '/') {
                    int tmp = (op == '*') ? sta.peek() * num : sta.peek() / num;
                    sta.pop();
                    sta.push(tmp);
                }
                op = s.charAt(i);
                num = 0;
            }
        }
        while (!sta.isEmpty()) {
            res += sta.pop();
        }
        return res;
    }
}
