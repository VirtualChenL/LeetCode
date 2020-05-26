/**
 * FileName: Thefirstcharacterthatappearsonlyonce
 * Description:  第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格
 * Author:   @VirtualChen
 * Date:     2020/4/26 20:50
 */
package src;

import java.util.HashMap;
import java.util.Map;

public class Thefirstcharacterthatappearsonlyonce {
    /**
     * 哈希表解决
     *
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), -1);
            } else {
                map.put(s.charAt(i), i);
            }
        }
        int idx = Integer.MAX_VALUE;
        for (Character c : map.keySet()) {
            if (map.get(c) != -1) {
                idx = Math.min(idx, map.get(c));
            }
        }
        if (idx == Integer.MAX_VALUE) {
            return ' ';
        }
        return s.charAt(idx);
    }

    /**
     * 优化,使用boolean作为map的value存储
     *
     * @param s
     * @return
     */
    public char firstUniqChar1(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), false);
            } else {
                map.put(s.charAt(i), true);
            }
        }
        for (char c : s.toCharArray()) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';
    }
}
