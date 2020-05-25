/**
 * FileName: Thelongestsubstringwithoutrepeatedharacters
 * Description:  最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度
 * Author:   @VirtualChen
 * Date:     2020/4/25 16:57
 */
package src;

import java.util.HashMap;
import java.util.Map;

public class Thelongestsubstringwithoutrepeatedharacters {
    /**
     * 动态规划+哈希表
     * 时间复杂度 O(N)
     * 空间复杂度 O(N)
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();//保存最近一次字符的地址idx
        int res = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) : -1;
            map.put(s.charAt(i), i);
            tmp = tmp < i - idx ? tmp + 1 : i - idx;
            res = Math.max(res, tmp);
        }
        return res;
    }


    /**
     *  动态规划 + 线性遍历
     *  时间复杂度 O(N^2)
     *  空间复杂度 O(1)
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = j - 1;
            while(i >= 0 && s.charAt(i) != s.charAt(j)) i--; // 线性查找 i
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }
}
