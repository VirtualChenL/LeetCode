/**
 * FileName: Cuttherope
 * Description:  剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18
 * Author:   @VirtualChen
 * Date:     2020/3/21 20:27
 */
package src;

public class Cuttherope {
    /**
     * 从下向上的动态规划
     * 时间复杂度O(n*n)  空间复杂度O(n)
     *
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int[] tem = new int[n + 1];
        tem[0] = 0;
        tem[1] = 1;
        tem[2] = 2;
        tem[3] = 3;
        int max = 0;
        for (int i = 4; i < n + 1; i++) {
            max = 0;
            for (int j = 1; j <= i; j++) {
                int m = tem[j] + tem[i - j];
                if (max < m) {
                    max = m;
                }
            }
            tem[i] = max;
        }
        return tem[n];
    }


    /**
     * 贪婪算法
     * 根据数学模型得到:
     * 合理的切分可以带来更大的乘积
     * 若切分合理,切分的越多,乘积越大
     * 为使乘积最大,只有长度为2和3的绳子不在切分,且3比2更优
     * 时间复杂度0(1) 空间复杂度O(1)
     *
     * @param n
     * @return
     */
    public int cuttingRope2(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int j = n / 3;
        int k = n % 3;
        if (k == 0) {
            return (int) Math.pow(3, j);
        }
        if (k == 1) {
            return (int) (Math.pow(3, j - 1) * 4);
        }
        if (k == 2) {
            return (int) (Math.pow(3, j) * 2);
        }
        return 0;
    }
}
