/**
 * @Auther: VirtualChen601
 * @Date: 2019/8/8 09:02
 * @Description:分割等和子集 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int size = nums.length;
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        //只有是偶数才会继续执行
        if ((s & 1) == 1) {
            return false;
        }

        int target = s / 2;
        // 从第 2 行以后，当前行的结果参考了上一行的结果，因此使用一维数组定义状态就可以了
        boolean[] dp = new boolean[target + 1];
        // 先写第 1 行，看看第 1 个数是不是能够刚好填满容量为 target
        for (int j = 1; j < target + 1; j++) {
            if (nums[0] == j) {
                dp[j] = true;
                // 如果等于，后面就不用做判断了，因为 j 会越来越大，肯定不等于 nums[0]
                break;
            }
        }
        // 注意：因为后面的参考了前面的，我们从后向前填写
        for (int i = 1; i < size; i++) {
            // 后面的容量越来越小，因此没有必要再判断了，退出当前循环
            for (int j = target; j >= 0 && j >= nums[i]; j--) {
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[target];
    }
}
