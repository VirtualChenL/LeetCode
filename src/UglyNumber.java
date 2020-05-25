/**
 * FileName: UglyNumber
 * Description: 丑数
 * 我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 * Author:   @VirtualChen
 * Date:     2020/4/25 18:07
 */
package src;

public class UglyNumber {
    /**
     * 动态规划
     * dp[i]=min(dp[a]×2,dp[b]×3,dp[c]×5)
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2;
            int n3 = dp[b] * 3;
            int n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n5) c++;

        }
        return dp[n - 1];
    }
}
