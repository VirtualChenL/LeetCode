import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/23 10:32
 * @Description:
 */
public class wordBreak2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> result = new LinkedList<>();
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0 && !dp[i]; j--) {
                String check = s.substring(j, i);
                dp[i] = dp[j] && wordDict.contains(check);
            }
        }
        if (dp[s.length()] == false) {
            return result;
        }
        StringBuilder sb = new StringBuilder();
        connnect(s, wordDict, sb, result, 0);
        return result;
    }
    private  void connnect(String s,List<String > wordDict,StringBuilder sb,List<String> res,int start){
        if(start==s.length()){
            res.add(sb.toString().trim());
            return;
        }
        for(int i=start+1;i<=s.length();i++){
            String str=s.substring(start,i);
            if(wordDict.contains(str)){
                int length=sb.length();
                sb.append(str).append(" ");
                connnect(s, wordDict, sb, res, i);
                sb.setLength(length);
            }
        }
    }
}
