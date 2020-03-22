import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/3 09:29
 * @Description:给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
 * <p>
 * 说明：
 * <p>
 * 字母异位词指字母相同，但排列不同的字符串。
 * 不考虑答案输出的顺序。
 */
public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (IsAna(s.substring(i, i + p.length()), p)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean IsAna(String s1, String s2) {
        int[] sd = new int[100];
        int[] sp = new int[100];
        for (int i = 0; i < 100; i++) {
            sd[i] = 0;
            sp[i] = 0;
        }
        for (int i = 0; i < s1.length(); i++) {
            sd[s1.charAt(i) - 65]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            sp[s2.charAt(i) - 65]++;
        }
        for (int i = 0; i < 100; i++) {
            if (sd[i] != sp[i]) {
                return false;
            }
        }
        return true;
    }
}
