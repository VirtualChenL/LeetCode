/**
 * FileName: Printfrom1tomaximumndigits
 * Description: 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * Author:   @VirtualChen
 * Date:     2020/2/21 21:29
 */
package src;

import java.util.ArrayList;
import java.util.List;

public class Printfrom1tomaximumndigits {
    /**
     * 未考虑大数据问题,当n特别大时,回超出int的表示返回,此时可以用bigInteger来表示
     *
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        int[] ans = new int[(int) (Math.pow(10, n) - 1)];
        for (int i = 0; i < Math.pow(10, n) - 1; i++) {
            ans[i] = i + 1;
        }
        return ans;
    }

    /**
     * 将问题转化为数字排列,同时利用递归代码更简单
     *
     * @param n
     * @return
     */
    public void printNumbers2(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n];
        for (int i = 0; i < 10; i++) {
            number[0] = (char) (i + '0');
            printMax(number, n, 0);
        }
    }

    private void printMax(char[] number, int length, int index) {
        if (index == length - 1) {
            System.out.println(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) (i + '0');
            printMax(number, length, index + 1);
        }
    }


}
