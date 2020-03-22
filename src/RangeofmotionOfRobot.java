/**
 * FileName: RangeofmotionOfRobot
 * Description:机器人的运动范围
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。
 * 但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子
 * <p>
 * Author:   @VirtualChen
 * Date:     2020/3/21 19:39
 */
package src;

public class RangeofmotionOfRobot {
    /**
     * 回溯算法
     * @param m
     * @param n
     * @param k
     * @return
     */
    public int movingCount(int m, int n, int k) {
        if (m <= 0 || n <= 0 || k < 0) {
            return 0;
        }
        boolean[] visited = new boolean[m * n];
        int count = movingCountCore(k, m, n, 0, 0, visited);
        return count;
    }

    private int movingCountCore(int k, int rows, int cols, int row, int col, boolean[] visited) {
        int count = 0;
        if (row < 0 || col < 0 || row >= rows || col >= cols || visited[row * cols + col]
                || (row / 10 + row % 10 + col % 10 + col / 10) > k) {
            return 0;
        }
        visited[row * cols + col] = true;
        return movingCountCore(k, rows, cols, row + 1, col, visited) +
                movingCountCore(k, rows, cols, row, col + 1, visited) +
                movingCountCore(k, rows, cols, row - 1, col, visited) +
                movingCountCore(k, rows, cols, row, col - 1, visited) + 1;
    }
}
