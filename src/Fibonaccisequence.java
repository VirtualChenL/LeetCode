/**
 * FileName: Fibonaccisequence
 * Description:斐波那契数列
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项
 * Author:   @VirtualChen
 * Date:     2020/3/18 22:23
 */
package src;

public class Fibonaccisequence {
    /**
     * 递归做法,
     * 存在很多重复的计算,效率低
     *
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    /**
     * 实用解法
     * 循环实现算法,从下往上计算
     * 时间复杂度为O(n)
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 0;
        int sec = 1;
        int tem = 0;
        for (int i = 2; i <= n; i++) {
            tem = sec%1000000007;
            sec = (first + sec)%1000000007;
            first = tem;
        }
        return sec;
    }
    
}
