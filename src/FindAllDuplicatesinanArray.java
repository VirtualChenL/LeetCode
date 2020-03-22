/**
 * FileName: FindAllDuplicatesinanArray
 * Description:给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
 * 找到所有出现两次的元素。
 * 你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗
 * Author:   @VirtualChen
 * Date:     2020/3/13 10:53
 */
package src;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    /**
     * 用坐标的正负来表示坐标+1对应数字的出现次数 第一次出现取负 第二次出现取负后变正,意味着该数字重复
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int number = Math.abs(nums[i]);
            int index = number - 1;
            nums[index] *= -1;
            if (nums[index] > 0) {
                ans.add(number);
            }
        }
        return ans;
    }

    /**
     * 原地hash
     *
     * @param nums
     * @return
     */
    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            while (nums[nums[i] - 1] != nums[i]) {
                int tmp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = tmp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
