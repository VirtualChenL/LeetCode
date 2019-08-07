/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/4 16:52
 * @Description:给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。
 * 你需要让组成和的完全平方数的个数最少。
 */
public class PerfectSquares {
    public int numSquares(int n) {
        if (n < 3) {
            return n;
        }
        int[] dp = new int[n + 1];
/**
 * 采用动态规划的方法来实现
 */
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
