/**
 * FileName: AsequenceofConsecutivepositiveNumbersWhoseSum
 * Description: 和为s的连续正数序列
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * <p>
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列
 * Author:   @VirtualChen
 * Date:     2020/4/30 14:33
 */
package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsequenceofConsecutivepositiveNumbersWhoseSum {
    /**
     * 数学归纳找规律
     * @param target
     * @return
     */
    public int[][] findContinuousSequence(int target) {
        int n = 2;
        List<int[]> list = new ArrayList<>();
        while ((target - (Math.pow(n, 2) - n) / 2) > 0) {
            int tem = (int) (target - (Math.pow(n, 2) - n) / 2);
            if (tem % n == 0) {
                int num = tem / n;
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = num + i;
                }
                list.add(arr);
            }
            n++;
        }
        Collections.reverse(list);
        return list.toArray(new int[0][]);
    }

    /**
     * 滑动窗口
     * @param target
     * @return
     */
    public int[][] findContinuousSequence1(int target) {
        int i = 1; // 滑动窗口的左边界
        int j = 1; // 滑动窗口的右边界
        int sum = 0; // 滑动窗口中数字的和
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += j;
                j++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= i;
                i++;
            } else {
                // 记录结果
                int[] arr = new int[j-i];
                for (int k = i; k < j; k++) {
                    arr[k-i] = k;
                }
                res.add(arr);
                // 左边界向右移动
                sum -= i;
                i++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
