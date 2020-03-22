/**
 * FileName: WaterandJugProblem
 * Description: 水壶问题
<<<<<<< HEAD
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？
 * <p>
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
 * Author:   @VirtualChen
 * Date:     2020/3/21 19:02
 */
package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class WaterandJugProblem {
//    public boolean canMeasureWater(int x, int y, int z) {
//        List<Integer> Water = new ArrayList<>();
//        Stack<Integer> stack = new Stack<>();
//        stack.push(Math.abs(x - y));
//        while (!stack.empty()) {
//            int k = stack.pop();
//            int m = Math.abs(x - k);
//            int n = Math.abs(y - k);
//            if (!Water.contains(m)) {
//                Water.add(m);
//                stack.add(m);
//            }
//            if (!Water.contains(n)) {
//                Water.add(n);
//                stack.add(n);
//            }
//            if (!Water.contains(m + x) && m + x <= x + y) {
//                Water.add(m + x);
//            }
//            if (!Water.contains(n + x) && n + x <= x + y) {
//                Water.add(n + x);
//            }
//        }
//        if (Water.contains(z)) {
//            return true;
//        }
//        return false;
//    }

    /**
     *求出最大公约数,看z是否能被z整除
     * @param x
     * @param y
     * @param z
     * @return
     */
    public boolean canMeasureWater2(int x, int y, int z) {
=======
 * Author:   @VirtualChen
 * Date:     2019/3/18 0018 上午 9:51
 */

/**
 * z是x和y的最大公约数的倍数即可
 */
public class WaterandJugProblem {
    public boolean canMeasureWater(int x, int y, int z) {
>>>>>>> 555d47a85339d3377427992a8ccd8f177fdcc450
        int key = Findmax(x, y);
        if (z > (x + y)) {
            return false;
        }
<<<<<<< HEAD
        if (z == 0) {
=======
        if(z==0){
>>>>>>> 555d47a85339d3377427992a8ccd8f177fdcc450
            return true;
        }
        if (x == 0 && y != z) {
            return false;
        }
        if (x == 0 && y == z) {
            return true;
        }
        if (y == 0 && x != z) {
            return false;
        }
        if (y == 0 && x == z) {
            return true;
        }
        if (z % key == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int Findmax(int x, int y) {
        int k = Math.min(x, y);
        while (k >= 1) {
            if ((x % k == 0) && (y % k == 0)) {
                return k;
            }
            k--;
        }
        return 0;
    }
}
