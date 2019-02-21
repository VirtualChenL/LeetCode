/**
 * FileName: SumofEvenNumbersAfterQueries
 * Description: 查询后的偶数和
 * Author:   @VirtualChen
 * Date:     2019/2/21 0021 上午 10:42
 */

public class SumofEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            A[queries[i][1]] = A[queries[i][1]] + queries[i][0];
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    result[i] = result[i] + A[j];
                }
            }
        }
        return result;
    }
}
