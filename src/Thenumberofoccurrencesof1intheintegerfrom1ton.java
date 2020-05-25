/**
 * FileName: Thenumberofoccurrencesof1intheintegerfrom1ton
 * Description:  1～n整数中1出现的次数
 * Author:   @VirtualChen
 * Date:     2020/4/24 9:41
 */
package src;

/**
 * 找规律，根据每一位上1出现的次数进行统计
 */
public class Thenumberofoccurrencesof1intheintegerfrom1ton {
    public int countDigitOne(int n) {
        int curr, low, tmp, high = n, i = 1, res = 0;
        while (high != 0) {
            high = (int) (n / Math.pow(10, i));
            tmp = (int) (n % Math.pow(10, i));
            curr = (int) (tmp / Math.pow(10, i - 1));
            low = (int) (tmp % Math.pow(10, i - 1));
            if (curr == 1) {
                res += high * Math.pow(10, i - 1) + low + 1;
            } else if (curr > 1) {
                res += (high + 1) * Math.pow(10, i - 1);
            } else {
                res += high * Math.pow(10, i - 1);
            }
            i++;
        }
        return res;
    }
}
