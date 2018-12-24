import java.util.Arrays;

/**
 * FileName: NRepeatedElementinSize2NArray
 * Description: 重复 N 次的元素
 * Author:   @VirtualChen
 * Date:     2018/12/24 0024 上午 10:27
 */

public class NRepeatedElementinSize2NArray {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int k = A.length / 2;
        if (A.length < 4) {
            return 0;
        } else {
            if (A[k - 1] == A[k - 2]) {
                return A[k - 1];
            } else {
                return A[k];
            }
        }
    }
}

