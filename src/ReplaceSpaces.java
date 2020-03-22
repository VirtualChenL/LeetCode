/**
 * FileName: ReplaceSpaces
 * Description:请实现一个函数，把字符串 s 中的每个空格替换成"%20"
 * Author:   @VirtualChen
 * Date:     2020/3/15 11:03
 */
package src;

public class ReplaceSpaces {
    /**
     * 通过stringbuilder来实现,
     * 时间复杂度O(n)
     *
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (' ' == s.charAt(i)) {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * Q:如果要求是在原来的字符串进行修改,并且保证修改的字符串后面有足够的空余内存
     * A:如果从前向后遍历替换的话,每次遇到空格都需要替换,时间复杂度为0(n2)
     * 采用从后往前的方式来解决,时间复杂度只需要O(n)
     * @param s
     * @return
     */
    public String replaceSpace2(String s) {
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k++;
            }
        }
        char[] cs = new char[s.length() + k * 2];
        int l = cs.length - 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                cs[l] = '%';
                cs[l - 1] = '0';
                cs[l - 2] = '2';
                l-=3;
            } else {
                cs[l] = s.charAt(i);
                System.out.println(cs[l]);
                l--;
            }
        }
        return String.valueOf(cs);
    }
}
