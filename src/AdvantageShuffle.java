import java.util.Arrays;

/**
 * FileName: AdvantageShuffle
 * Description: 优势洗牌
 * Author:   @VirtualChen
 * Date:     2019/3/5 0005 上午 10:55
 */

public class AdvantageShuffle {
    public int[] advantageCount(int[] A, int[] B) {
        int[] result = new int[A.length];
        Arrays.sort(A);
        for (int i = 0; i < B.length; i++) {
            int k = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] > B[i]) {
                    result[i] = A[j];
                    k = 1;
                    A[j] = -1;
                    break;
                }
            }
            if (k == 0) {
                for (int j = 0; j < A.length; j++) {
                    if (A[j] != -1) {
                        result[i] = A[j];
                        A[j] = -1;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
