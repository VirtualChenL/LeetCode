import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/5 09:09
 * @Description:给定一个无重复元素的数组 candidates 和一个目标数 target ，
 * 找出 candidates 中所有可以使数字和为 target 的组合。
 */

/**
 * 递归回溯
 */
public class CombinationSum {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        combination(candidates, target, sum, 0, list);
        return ans;
    }

    public void combination(int[] candiates, int target, int sum, int index, List<Integer> list) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            ans.add(list);
            return;
        }
        for (int i = index; i < candiates.length; i++) {
            List<Integer> list1 = new ArrayList<>(list);//继承之前的list
            list1.add(candiates[i]);
            combination(candiates, target, sum + candiates[i], i, list1);
        }
    }
}
