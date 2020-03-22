import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/6/26 15:24
 * @Description:给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。） 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * <p>
 * 返回所有不常用单词的列表。
 */
public class UncommonWordsfromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        List<String> ans = new LinkedList<>();
        String[] sa = A.split("\\s+");
        String[] sb = B.split("\\s+");
        for (int i = 0; i < sa.length; i++) {
            String tem = sa[i];
            int anum = 0;
            int bnum = 0;
            for (int j = 0; j < sa.length; j++) {
                if (sa[j].equals(tem)) {
                    anum++;
                }
            }
            for (int j = 0; j < sb.length; j++) {
                if (sb[j].equals(tem)) {
                    bnum++;
                }
            }
            if (anum == 1 && bnum == 0) {
                ans.add(tem);
            }
        }
        for (int i = 0; i < sb.length; i++) {
            String tem = sb[i];
            int anum = 1;
            int bnum = 0;
            for (int j = 0; j < sb.length; j++) {
                if (sb[j].equals(tem)) {
                    anum++;
                }
            }
            for (int j = 0; j < sa.length; j++) {
                if (sa[j].equals(tem)) {
                    bnum++;
                }
            }
            if (anum == 1 && bnum == 0) {
                ans.add(tem);
            }
        }
        String[] ansstr = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansstr[i] = ans.get(i);
        }
        return ansstr;
    }
}
