/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/4 16:19
 * @Description:给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 */
public class PalindromicSubstrings {
    int num;
    public int countSubstrings(String s) {
        char[] tem = s.toCharArray();
        for (int i = 0; i < tem.length; i++) {
            Palindrom(s, i, i);//长度为奇数
            Palindrom(s, i, i + 1);//长度为偶数
        }
        return num;
    }

    /**
     * 对满足回文的字符串从中间向两端扩展
     * @param s
     * @param start
     * @param end
     */
    public void Palindrom(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            num++;
            start--;
            end++;
        }
    }
}
