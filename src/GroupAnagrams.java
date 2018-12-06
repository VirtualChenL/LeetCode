import java.lang.reflect.Array;
import java.util.*;

/**
 * 字谜分组
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0||strs==null) {
            return new ArrayList<List<String>>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String news = String.valueOf(chars);
            if (map.containsKey(news)) {
                map.put(news, new ArrayList<String>());
            }
            map.get(news).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
