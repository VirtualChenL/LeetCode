/**
 *矩阵置零
 * 空间复杂度O（1）
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (matrix[i][k] == 0) {
                            for (int m = 0; m < matrix.length; m++) {
                                if(matrix[m][k]!=0)
                                matrix[m][k] = Integer.MAX_VALUE-1;
                            }
                        } else {
                            if(matrix[i][k]!=0)
                            matrix[i][k] = Integer.MAX_VALUE-1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==Integer.MAX_VALUE-1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}