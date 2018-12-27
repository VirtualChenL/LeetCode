import java.util.ArrayList;
import java.util.List;

/**
 * FileName: ToeplitzMatrix
 * Description: 托普利茨矩阵
 * Author:   @VirtualChen
 * Date:     2018/12/27 0027 下午 7:11
 */

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
