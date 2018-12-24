/**
 * FileName: LengthofLastWord
 * Description: 最后一个单词的长度
 * Author:   @VirtualChen
 * Date:     2018/12/24 0024 上午 10:45
 */

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] ss=s.split(" ");
        if(ss.length<1){
            return 0;
        }
        char[] cs=ss[ss.length-1].toCharArray();
        return cs.length;
    }
}
