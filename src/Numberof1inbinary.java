/**
 * FileName: Numberof1inbinary
 * Description:二进制中1的个数
 * 请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。
 * 例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2
 * Author:   @VirtualChen
 * Date:     2020/3/22 12:51
 */
package src;

public class Numberof1inbinary {
    /**
     * 调用api
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int ans = 0;
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                ans++;
            }
        }
        return ans;
    }

    /**
     * 使用位运算将十进制转化为二进制
     * 需进行32次判断
     *
     * @param n
     * @return
     */
    public int hammingWeight2(int n) {
        int ans = 0;
        for (int i = 31; i >= 0; i--) {
            if ((n >>> i & 1) == 1) {
                ans++;
            }
        }
        return ans;
    }

    /**
     * 把一个整数减1再与原整数做与运算,就会把该整数的最右边的一个1变成0.
     * 所以一个整数的二进制中有多少个1就进行多少次该运算
     *
     * @param n
     * @return
     */
    public int hammingWeight3(int n) {
        int ans = 0;
        while (n != 0) {
            ans++;
            n = (n - 1) & n;
        }
        return ans;
    }
}
