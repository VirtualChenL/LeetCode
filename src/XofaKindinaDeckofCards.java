/**
 * FileName: XofaKindinaDeckofCards
 * Description:卡牌分组
 * 给定一副牌，每张牌上都写着一个整数。
 * <p>
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * <p>
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true
 * Author:   @VirtualChen
 * Date:     2020/3/27 20:42
 */
package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class XofaKindinaDeckofCards {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int i = 0; i < deck.length; i++) {
            count[deck[i]]++;
        }
        int k = -1;
        for (int i = 0; i < 10000; i++) {
            if (count[i] > 0) {
                if (k == -1) {
                    k = count[i];
                } else {
                    k = gcd(k, count[i]);
                }
            }
        }
        return k >= 2;
    }

    private int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
