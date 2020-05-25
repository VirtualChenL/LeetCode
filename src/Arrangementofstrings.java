/**
 * FileName: Arrangementofstrings
 * Description: 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素
 * Author:   @VirtualChen
 * Date:     2020/4/18 11:04
 */
package src;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Arrangementofstrings {
    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int idx) {
        if (idx == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int i = idx; i < c.length; i++) {
            if (set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i, idx);
            dfs(idx + 1);
            swap(i, idx);
        }
    }

    private void swap(int i, int idx) {
        char tmp = c[i];
        c[i] = c[idx];
        c[idx] = tmp;
    }
}
