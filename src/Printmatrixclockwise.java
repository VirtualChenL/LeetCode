/**
 * FileName: Printmatrixclockwise
 * Description: 顺时针打印矩阵
 * Author:   @VirtualChen
 * Date:     2020/3/30 21:29
 */
package src;

import java.util.ArrayList;
import java.util.List;

public class Printmatrixclockwise {
    /**
     * 注意判断边界
     * @param matrix
     * @return
     */
    public int[] spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
            return new int[0];
        }
        int start = 0;
        while (matrix.length > 2 * start && matrix[0].length > start * 2) {
            ans = MatrixCore(ans, matrix, start);
            start++;
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    private List<Integer> MatrixCore(List<Integer> ans, int[][] matrix, int start) {
        int endX = matrix[0].length - 1 - start;//最大列坐标
        int endY = matrix.length - 1 - start;//最大行坐标

        //从左往右
        for (int i = start; i <= endX; i++) {
            ans.add(matrix[start][i]);
        }
        // 从上往下
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                ans.add(matrix[i][endX]);
            }
        }
        //从右往左
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                ans.add(matrix[endY][i]);
            }
        }
        //从下往上
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--) {
                ans.add(matrix[i][start]);
            }
        }
        return ans;

    }

    /**
     * 整合在一起
     * 时间复杂度 O(MN) ： M, NM,N 分别为矩阵行数和列数。
     * 空间复杂度 O(1) ： 四个边界 l , r , t , b 使用常数大小的 额外 空间（ res 为必须使用的空间）。
     *
     * @param matrix
     * @return
     */
    public int[] spiralOrder2(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res = new int[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right.
            if (++t > b) break;
            for (int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom.
            if (l > --r) break;
            for (int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left.
            if (t > --b) break;
            for (int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top.
            if (++l > r) break;
        }
        return res;
    }
}
