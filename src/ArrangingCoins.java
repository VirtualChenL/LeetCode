/**
 * FileName: ArrangingCoins
 * Description: 排列硬币
 * Author:   @VirtualChen
 * Date:     2018/12/28 0028 下午 4:08
 */

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        return (int )(Math.sqrt(2*(long)n+0.25)-0.5);
    }
}
