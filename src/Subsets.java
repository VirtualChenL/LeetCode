import java.util.ArrayList;
import java.util.List;

/**
 * FileName: Subsets
 * Description: 子集
 * Author:   @VirtualChen
 * Date:     2018/12/19 0019 下午 3:42
 */

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(listList, temp, nums, 0);
        return listList;
    }

    private void dfs(List<List<Integer>> listList, List<Integer> temp, int[] nums, int j) {
        listList.add(new ArrayList<>(temp));
        for (int i = j; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(listList, temp, nums, i + 1);//递归
            temp.remove(temp.size() - 1);//移除nums[i]
        }
    }
}
