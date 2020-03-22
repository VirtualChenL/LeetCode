/**
 * FileName: LCOF
 * Description: 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * Author:   @VirtualChen
 * Date:     2020/2/21 20:08
 */
package src;

public class LCOF {
    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        char[] cs = s.toCharArray();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(cs[i]);
        }
        for (int i = n; i < cs.length; i++) {
            stringBuilder2.append(cs[i]);
        }
        return stringBuilder2.toString() + stringBuilder.toString();
    }

}
