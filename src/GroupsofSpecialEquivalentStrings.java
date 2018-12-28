import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * FileName: GroupsofSpecialEquivalentStrings
 * Description: 特殊等价字符串组
 * Author:   @VirtualChen
 * Date:     2018/12/28 0028 下午 3:42
 */

public class GroupsofSpecialEquivalentStrings {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet();
        for (String S: A) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i)
                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            seen.add(Arrays.toString(count));
        }
        return seen.size();
    }
}
