/**
 * 最长回文子串
 */
public class LongestPalindromicSubstring {
    /**
     * 方法一，依次判断是否为回文序列
     * 时间复杂度太高
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int k = 0;
        String answer = new String();
        for (int i = 0; i < s.length(); i++) {
            StringBuffer buffer = new StringBuffer();
            for (int j = i; j < s.length(); j++) {
                buffer.append(s.charAt(j));
                if (isPalindrome(buffer.toString())) {
                    if (buffer.length() > k) {
                        k = buffer.length();
                        answer = buffer.toString();
                    }
                }
            }
            if (k >= s.length() - 1 - i) {
                break;
            }
        }
        return answer;
    }

    public boolean isPalindrome(String ss) {
        int len = ss.length();
        for (int i = 0; i < len / 2; i++) {
            if (ss.charAt(i) != ss.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 方法二 从源字符串中构建回文子串
     *
     * @param s
     * @return
     */
    public  int maxlen=0;
    public int location=0;
    public String longestPalindrome2(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        for (int i = 0; i < len; i++) {
            extendPalindrome(s,i,i);
            extendPalindrome(s,i,i+1);
        }
        return  s.substring(location,location+maxlen);
    }

    private void extendPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if(maxlen<j-i-1)
        {
            location=i+1;
            maxlen=j-i-1;
        }
    }
}
