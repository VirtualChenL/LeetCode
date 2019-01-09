import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/**
 * FileName: LongestIncreasingSubsequence
 * Description: 最长上升子序列
 * Author:   @VirtualChen
 * Date:     2019/1/9 0009 上午 9:12
 */

public class LongestIncreasingSubsequence {
    /**
     * 动态规划
     * dp[i]表示以nums[i]结尾的最长上升子序列。
     * nums[i]之前的元素，哪个元素比nums[i]要小，并且它的dp[]值最大，
     * 那么dp[i]就在它dp值的基础上加1即可。最后求所有dp数组的最大值。
     *
     * @param nums
     * @return
     */
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 0) {
            return 0;
        }
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxdp = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    maxdp = Math.max(maxdp, dp[j] + 1);
                }
            }
            dp[i] = maxdp + 1;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    /**
     * 建立数组，若后面的元素比数组最后一个大，则在最后面加上该元素，
     * 否则，替换掉数组中第一个大于等于它的元素
     * @param nums
     * @return
     */
    public int lengthOfLIS2(int[] nums) {
        LinkedList<Integer> vec = new LinkedList<>();
        if (nums.length == 0) {
            return 0;
        }
        vec.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > vec.getLast()) {
                vec.add(nums[i]);
            } else {
                for (int j = 0; j < nums.length; j++) {
                    if (vec.get(j) >= nums[i]) {
                        vec.set(j, nums[i]);
                        break;
                    }
                }
            }
        }
        return vec.size();
    }

}
