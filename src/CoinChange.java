import java.util.Arrays;

/**
 * FileName: CoinChange
 * Description: 零钱兑换
 * Author:   @VirtualChen
 * Date:     2019/1/7 0007 下午 4:07
 */

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0) {
                    if (dp[i] > dp[i - coins[j]] + 1) {
                        dp[i] = dp[i - coins[j]] + 1;
                    }
                }
            }
        }
        if (dp[amount] >= Integer.MAX_VALUE) {
            return -1;
        } else {
            return dp[amount];
        }
    }
}
