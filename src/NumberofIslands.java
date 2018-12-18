/**
 * FileName: NumberofIslands
 * Description: 岛屿的个数
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 上午 10:30
 */

public class NumberofIslands {
    int x;
    int y;
    char[][] g;

    public int numIslands(char[][] grid) {
        g = grid;
        int answer = 0;
        //行数
        y = g.length;
        if (y == 0) {
            return 0;
        }
        //列数
        x = g[0].length;
        //对数组进行遍历
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (g[i][j] == '1') {
                    dfs(i, j);
                    answer++;
                }

            }
        }
        return answer;
    }

    /**
     * dfs搜索算法
     * 将遍历过的单元格置零
     *
     * @param i
     * @param j
     */
    private void dfs(int i, int j) {
        //边界条件
        if (i < 0 || i >= y || j < 0 || j >= x || g[i][j] != '1') {
            return;
        }
        //访问过的置零
        g[i][j] = '0';
        //检查相邻的上下左右四个方向的位置
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);

    }
}
