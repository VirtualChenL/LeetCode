/**
 * FileName: Lookupinatwodimensionalarray
 * Description: 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 * Author:   @VirtualChen
 * Date:     2020/3/15 10:28
 */
package src;

public class Lookupinatwodimensionalarray {
    /**
     * 选取数组右上角的数字,如果该数字等于要查找的数字,则查找过程结束,如果该数字大于要查找的数字,则剔除这一列,
     * 如果该数字小于要查找的数字则剔除这一行.
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int j = matrix[0].length - 1;
        int k = 0;
        while (j >= 0 && k < matrix.length) {
            if (matrix[k][j] == target) {
                return true;
            } else if (matrix[k][j] > target) {
                j--;
            } else {
                k++;
            }
        }
        return false;
    }
}
