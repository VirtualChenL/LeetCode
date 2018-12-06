import java.util.HashSet;
import java.util.Set;

/**
 * 最长的无重复子串
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int answer = 0;
        int i = 0;
        int j = 0;
        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                answer = Integer.max(answer, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }

        }
        return answer;
    }
}
