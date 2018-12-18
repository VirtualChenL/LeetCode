/**
 * FileName: DIStringMatch
 * Description: 增减字符串匹配
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 下午 8:05
 */

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        int len=S.length();
        int m=len;
        int n=0;
        int [] answer=new int[len+1];
        for(int i=0;i<len;i++){
            if(S.charAt(i)=='I'){
                answer[i]=n;
                n++;
            }else {
                answer[i]=m;
                m--;
            }
        }
        answer[len]=n;
        return answer;
    }
}
