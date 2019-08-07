import java.util.Stack;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/31 19:45
 * @Description:给定一个经过编码的字符串，返回它解码后的字符串。 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * <p>
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * <p>
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
 */
public class DecodeString {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String tempStr = null;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == ']') {
                String str = strStack.pop();
                int num = numStack.pop();
                String nowStr = repeatStr(str, num);
                if (!numStack.isEmpty()) {
                    StringBuilder  builder = new StringBuilder();
                    builder.append(strStack.peek());
                    builder.append(nowStr);
                    int m = i + 1;
                    while (s.charAt(m) != ']' && !('0' < s.charAt(m) && '9' >= s.charAt(m))) {
                        m++;
                    }
                    builder.append(s.substring(i + 1, m));
                    strStack.set(strStack.size() - 1, builder.toString());
                    i = m - 1;
                } else {
                    tempStr = null;
                    res.append(nowStr);
                }
            } else if ('0' <= c && '9' >= c) {
                int m = i + 1;
                while ('0' <= s.charAt(m) && '9' >= s.charAt(m)) {
                    m++;
                }
                numStack.push(Integer.parseInt(s.substring(i, m)));
                i = m - 1;
                int k =  i + 2;
                while (s.charAt(k) != ']' && !('0' <= s.charAt(k) && '9' >= s.charAt(k)))  {
                    k++;
                }
                strStack.push(s.substring(i+2, k));
                i = k - 1;
            } else if (numStack.isEmpty()) {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    private String repeatStr(String str, int num) {
        StringBuilder sb = new StringBuilder();
        if (num <= 0) {
            return "";
        }
        for (int i = 0; i < num; i++) {
            sb.append(str);
        }
        return sb.toString();

    }
}
