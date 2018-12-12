/**
 * FileName: Searcha2DMatrix
 * Description: 搜寻二维数组
 * Author:   @VirtualChen
 * Date:     2018/12/12 0012 下午 9:12
 */

public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0;
        int j = 0;
        for (i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target) {
                if (i == 0) {
                    return false;
                }
                break;
            }
        }
        i--;
        for (j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                return false;
            }
        }
        return false;
    }
}

