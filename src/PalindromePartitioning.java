import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/3 09:39
 * @Description:给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
 * <p>
 * 返回 s 所有可能的分割方案。
 */
public class PalindromePartitioning {
    /**
     * 回溯法
     *
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new LinkedList<>();
        backtrack(ans, s, new ArrayList<>());
        return ans;
    }

    public void backtrack(List<List<String>> res, String s, ArrayList<String> tmp) {
        if (s == null || s.length() == 0) res.add(new ArrayList<>(tmp));
        for (int i = 1; i <= s.length(); i++) {
            if (ispalindrome(s.substring(0, i))) {
                tmp.add(s.substring(0, i));
                backtrack(res, s.substring(i, s.length()), tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }

    public Boolean ispalindrome(String s) {
        int m = 0;
        int n = s.length() - 1;
        while (m < n) {
            if (s.charAt(m) != s.charAt(n)) {
                return false;
            }
        }
        return true;
    }
}
