/**
 * FileName: Theproblemoffrogjumpingonthesteps
 * Description:青蛙跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 * Author:   @VirtualChen
 * Date:     2020/3/19 21:07
 */
package src;

public class Theproblemoffrogjumpingonthesteps {
    /**
     * f(n)=f(n-1)+f(n-2)
     * 递归实现
     * 超出时间限制
     *
     * @param n
     * @return
     */
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return numWays(n - 1) + numWays(n - 2);
    }

    /**
     * 从下往上的循环
     * @param n
     * @return
     */
    public int numWays2(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2])%1000000007;
        }
        return dp[n];
    }

}