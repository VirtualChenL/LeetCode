/**
 * FileName: Integerpowerofvalue
 * Description: 数值的整数次方
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题
 * Author:   @VirtualChen
 * Date:     2020/3/22 14:25
 */
package src;

public class Integerpowerofvalue {
    /**
     * 时间复杂度O(n)
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, int n) {
        double ans = 1.0;
        int k = 0;
        if (n == 0) {
            return 1.0;
        }
        if (x == 1) {
            return 1.0;
        }
        if (n < 0) {
            k = 1;
            n = -n;
        }
        for (int i = 0; i < n; i++) {
            ans *= x;
        }
        return k == 0 ? ans : 1 / ans;
    }

    /**
     * 二分法角度解决
     * 向下整除 n/2 等价于 右移一位 n >> 1；
     * 取余数 n % 2等价于 判断二进制最右一位值 n & 1
     * 时间复杂度 O(log_2 n) 空间复杂度O(1)
     *
     * @param x
     * @param n
     * @return
     */
    public double myPow2(double x, int n) {
        if (n == 0) {
            return 0;
        }
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }

}
