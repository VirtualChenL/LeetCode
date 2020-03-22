import java.util.Arrays;

/**
 * FileName: LargestPerimeterTriangle
 * Description: 三角形的最大周长
 * Author:   @VirtualChen
 * Date:     2019/3/22 0022 上午 9:28
 */

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}
