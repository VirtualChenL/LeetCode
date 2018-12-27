/**
 * FileName: LongestUncommonSubsequenceI
 * Description: 最长特殊序列 Ⅰ
 * Author:   @VirtualChen
 * Date:     2018/12/27 0027 下午 7:04
 */

public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        int lena=a.length();
        int lenb=b.length();
        return Math.max(lena,lenb);
    }
}
