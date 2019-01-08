import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * FileName: GenerateParentheses
 * Description: 括号生成
 * Author:   @VirtualChen
 * Date:     2019/1/7 0007 上午 10:10
 */

public class GenerateParentheses {
    /**
     * 递归
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> list=new LinkedList<>();
        if(n==0) return list;
        digui("",list,n,n);
        return list;
    }

    public static void digui(String s,List<String> list,int left,int right) {
        if(left>right){
            return;
        }
        if(left>0){
            digui(s+"(",list,left-1,right);
        }
        if(right>0){
            digui(s+")",list,left,right+1);
        }
        if(left==0&&right==0){
            list.add(s);
            return;
        }
    }

}
