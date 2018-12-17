import com.sun.org.apache.xerces.internal.xs.LSInputList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: LetterCombinationsofaPhoneNumbe
 * Description: 电话号码的字母组合
 * Author:   @VirtualChen
 * Date:     2018/12/17 0017 上午 8:51
 */

public class LetterCombinationsofaPhoneNumbe {
    public List<String> letterCombinations(String digits) {
        List<String> list = new LinkedList<>();
        String[][] nums = new String[][]{
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"},
                {"j", "k", "l"},
                {"m", "n", "o"},
                {"p", "q", "r", "s"},
                {"t", "u", "v"},
                {"w", "x", "y", "z"},
        };
        if (digits.length() == 0) {
            return list;
        }
        int first = digits.charAt(0) - 50;
        String[] current = nums[first];
        if (digits.length() == 1) {
            list.addAll(Arrays.asList(current));
            return list;
        }

        List<String> stringlist = letterCombinations(digits.substring(1));
        for (String a : current) {
            for (String b : stringlist) {
                list.add(a + b);
            }
        }
        return list;
    }
}
