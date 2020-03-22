/**
 * FileName: FactorialTrailingZeroes
 * Description: 阶乘后的零
 * Author:   @VirtualChen
 * Date:     2019/1/9 0009 上午 10:46
 */

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 1)
            count += (n /= 5);
        return count;
    }
}
