import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: SpiralMatrix
 * Description: 螺旋矩阵
 * Author:   @VirtualChen
 * Date:     2019/3/4 0004 上午 8:48
 */

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int M = matrix.length;
        if (M == 0) return new ArrayList<Integer>();
        int N = matrix[0].length;
        List<Integer> list = new ArrayList<>(M*N);


        int i,j;
        // 余下矩阵的行数与列数
        int p = M, q = N;
        // 读取一圈元素的其实点
        int m = 0;
        while(p>0 && q>0) {
            // 读取矩阵的一圈
            i = m; j= m;
            while(j<=N-m-1) list.add(matrix[i][j++]);
            i = i+1; j = N-m-1;
            while(i<=M-m-1) list.add(matrix[i++][j]);
            i = M-m-1; j=j-1;
            // 这里的i>m很有必要，矩阵的一圈可能为单行或单列
            while(i>m && j>=m) list.add(matrix[i][j--]);
            i = i-1; j=m;
            // 这里的j<N-m-1很有必要，矩阵的一圈可能为单行或单列
            while(i>m && j<N-m-1) list.add(matrix[i--][j]);

            m++;
            p-=2;
            q-=2;
        }
        return list;
    }
}
