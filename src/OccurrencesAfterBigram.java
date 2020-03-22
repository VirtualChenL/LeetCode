import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/6/26 11:06
 * @Description:给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，
 * 其中 second 紧随 first 出现，third 紧随 second 出现。
 * <p>
 * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
 */
public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> ans = new LinkedList<>();
        String[] txt = text.split("\\s+");
        for (int i = 0; i < txt.length - 2; i++) {
            System.out.println(txt[i]);
            if (txt[i].equals(first)) {
                System.out.println("111");
                if (txt[i + 1].equals(second)) {
                    System.out.println("2222");
                    ans.add(txt[i + 2]);

                }
            }
        }
        String[] tem = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            tem[i] = ans.get(i);
        }
        return tem;
    }

}
