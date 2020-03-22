package src;

import java.util.*;

/**
 * 最长回文串
 *
 * @author Administrator
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int k = 0;
        List<Character> list = new LinkedList<>();
        list.add((char) 1);
        if (s.length() == 1) {
            return 1;
        } else {
            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i));
            }
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (j != i && list.get(i) == list.get(j)) {
                        k++;
                        list.remove(i);
                        list.remove(j - 1);
                        i = 0;
                        j = 0;
                        break;
                    }
                }
            }
            if (s.length() - 2 * k >= 1) {
                return 2 * k + 1;
            } else {
                return 2 * k;
            }
        }
    }

    /**
     * 出现了偶数次的字母都成构成回文串,出现奇数次的字母,其可看做偶数次+1,
     * 回文串中最多有一个出现奇数次的字母位于最中间
     *
     * @param s
     * @return
     */
    public int longestPalindrome2(String s) {
        char[] cs = s.toCharArray();
        int[] dir = new int[58];
        int k = 0;
        for (int i = 0; i < cs.length; i++) {
            dir[cs[i] - 'a']++;
        }
        for (int i = 0; i < dir.length; i++) {
            k += dir[i] / 2;
        }
        return 2 * k < s.length() ? 2 * k + 1 : 2 * k;
    }

    /**
     * 通过set来判断奇偶
     *
     * @param s
     * @return
     */
    public int longestPalindrome3(String s) {
        int ans = 0;
        Set set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                ans += 2;
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return ans < s.length() ? ans + 1 : ans;
    }
}
