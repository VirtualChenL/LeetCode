/**
 * FileName: Thegreatestvalueofgifts
 * Description:礼物的最大价值
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、
 * 直到到达棋盘的右下角。给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物
 * Author:   @VirtualChen
 * Date:     2020/4/25 16:06
 */
package src;

public class Thegreatestvalueofgifts {
    /**
     * 动态规划
     * 通过循环,使用二维数组保存每个点的最大礼物价值
     *
     * @param grid
     * @return
     */
    public int maxValue(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        if (grid.length == 1 && grid[0].length == 1) {
            return grid[0][0];
        }
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

    /**
     * 动态规划
     * 使用一维数组进行保存
     * 一维数组长度为原数组的列数
     * 求f(i,j)的最大礼物值时,一维数组中前j个数字分别是第i行前面的j个格子的礼物最大值,
     * 而数组中j后面的保存的是上一行从j开始到最后一个的格子的礼物最大值.
     * @param grid
     * @return
     */
    public int maxValue1(int[][] grid) {
        if (grid == null || grid.length <= 0 || grid[0].length <= 0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[] maxValue = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int left = 0;
                int up = 0;
                if (i > 0)
                    up = maxValue[j];
                if (j > 0)
                    left = maxValue[j - 1];
                maxValue[j] = Math.max(up, left) + grid[i][j];
            }
        }
        return maxValue[cols - 1];
    }
}
