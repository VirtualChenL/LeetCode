/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/8 08:57
 * @Description:有 n 个气球，编号为0 到 n-1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
 * <p>
 * 现在要求你戳破所有的气球。每当你戳破一个气球 i 时，你可以获得 nums[left] * nums[i] * nums[right] 个硬币。
 *  这里的 left 和 right 代表和 i 相邻的两个气球的序号。注意当你戳破了气球 i 后，气球 left 和气球 right 就变成了相邻的气球。
 * 求所能获得硬币的最大数量。
 */
public class BurstBalloons {
    public int maxCoins(int[] nums) {
        int[][] d = new int[nums.length + 2][nums.length + 2];
        int[] a = new int[nums.length + 2];
        for (int i = 1; i < a.length - 1; i++) {
            a[i] = nums[i - 1];
        }
        a[0] = 1;
        a[a.length - 1] = 1;
        for (int i = 0; i < a.length; i++) {
            d[i][i] = 0;
        }
        for (int i = 2; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                for (int k = j + 1; k < j + i; k++) {
                    d[j][j + i] = Math.max(d[j][j + i], d[j][k] + d[k][j + i] + a[j] * a[k] * a[j + i]);
                }
            }
        }
        return d[0][a.length - 1];
    }

}
