import java.util.LinkedList;
import java.util.List;

/**
 * FileName: PermutationSequence
 * Description: 第k个排列
 * Author:   @VirtualChen
 * Date:     2019/3/7 0007 上午 9:59
 */

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int[] fac = new int[n + 1];
        int key = 1;
        fac[0] = 1;
        for (int i = 1; i <= n; i++) {
            list.add(i);
            key *= i;
            fac[i] = key;
        }
        k--;
        for (int i = n - 1; i >= 0; i--) {
            int index = k / fac[i];
            sb.append(list.remove(index));
            k -= index * fac[i];
        }
        return sb.toString();
    }
}
