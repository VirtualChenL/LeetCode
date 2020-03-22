import java.util.Arrays;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/12 08:54
 * @Description:
 */
public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
       int [] tem=new int [matrix.length*matrix.length];
        int t=0;
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix.length;j++){
               tem[t+j]=matrix[i][j];
           }
           t=t+matrix.length;
       }
        Arrays.sort(tem);
       return tem[k-1];
    }
}
