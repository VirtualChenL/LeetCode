import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: Permutations
 * Description: 全排列
 * Author:   @VirtualChen
 * Date:     2018/12/17 0017 上午 9:14
 */

public class Permutations {
    /**
     * 递归
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> listList = new LinkedList<>();
        List<Integer> tem = new LinkedList<>();
        dfs(listList, nums, 0);
        return listList;
    }

    private void dfs(List<List<Integer>> res, int[] nums, int j) {
        if (j == nums.length) {
            List<Integer> list = new LinkedList<>();
            for (int num : nums) {
                list.add(num);
            }
            res.add(list);
        }
        for (int i = j; i < nums.length; i++) {
            swap(nums, i, j);
            dfs(res, nums, j + 1);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 非递归算法
     * @param nums
     * @return
     */
    public List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(nums[0]);
        res.add(first);
        for(int i = 1; i < nums.length; i++) {
            List<List<Integer>> newRes = new ArrayList<>();
            for(List<Integer> temp : res) {
                int size = temp.size() + 1;
                for(int j = 0; j < size; j++) {
                    List<Integer> item = new ArrayList<>(temp);
                    item.add(j, nums[i]);
                    newRes.add(item);
                }
            }
            res = newRes;
        }
        return res;
    }
}
