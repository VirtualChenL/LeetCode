/**
 * FileName: MinimumIncrementtoMakeArrayUnique
 * Description:给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 * <p>
 * 返回使 A 中的每个值都是唯一的最少操作次数
 * Author:   @VirtualChen
 * Date:     2020/3/22 21:12
 */
package src;

import java.util.Arrays;
import java.util.Stack;

public class MinimumIncrementtoMakeArrayUnique {
    /**
     * 先排序在比较,如果当前数字和前一个相等,则加1 继续往后遍历
     * 时间复杂度 O(nlogn)
     *
     * @param A
     * @return
     */
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int res = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                int top = A[i];
                A[i] = A[i - 1] + 1;
                res += A[i] - top;
            }
        }
        return res;
    }

    /**
     * 计数排序法
     * 时间复杂度O(n)
     *
     * @param A
     * @return
     */
    public int minIncrementForUnique3(int[] A) {
        int[] counter = new int[40001];
        int max = -1;//记录A中最大的数字出现的位子
        for (int num : A) {
            counter[num]++;
            max = Math.max(num, max);
        }

        int move = 0;
        for (int num = 0; num <= max; num++) {
            if (counter[num] > 1) {
                //如果出现多个相同的数字,则只保留一个数字,其余的数字都向后移动一位
                int d = counter[num] - 1;
                move += d;
                counter[num + 1] += d;//移动后,后一位的数字增加了d个
            }
        }
        //移动重复操作,知道最后一个数字的位子max,以及后移产生的max+1
        int d = counter[max + 1] - 1;
        //max+1的d个数字只保留1个,其余的依次向后移动步数[1,2,3,4...d],利用求和公式可以得到总的步数
        move += (1 + d) * d / 2;
        return move;
    }

}
