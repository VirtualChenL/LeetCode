import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/6/26 10:26
 * @Description:给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
 * 例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i <= 26; i++) {
            int k = Integer.MAX_VALUE;
            for (int j = 0; j < A.length; j++) {
                k = Integer.min(k, checkChar(A[j], (char) (i + 96)));
            }
            for (int j = 0; j < k; j++) {
                list.add(String.valueOf((char)(i + 96)));
            }
        }
        return list;
    }

    public int checkChar(String s, char c) {
        int num = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == c) {
                num++;
            }
        }
        return num;
    }
}
