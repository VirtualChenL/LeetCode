import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/4/4 09:35
 * @Description:组合总和 III
 */
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> tem=new LinkedList<>();
        calculate(ans,tem,1,k,n);
        return ans;
    }

    /**
     * 回溯算法
     * @param ans
     * @param tem
     * @param index
     * @param k
     * @param n
     */
    private void calculate(List<List<Integer>> ans, List<Integer> tem,int index, int k, int n) {
        if (n < 0) {
            return;
        }
        if (n==0&&tem.size()==k){
            ans.add(new LinkedList<>(tem));
            return;
        }
        for(int i=index;i<10;i++){
            tem.add(i);
            calculate(ans,tem,i+1,k,n-i);
            tem.remove(tem.size()-1);
        }
    }
}
