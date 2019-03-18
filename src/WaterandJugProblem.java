/**
 * FileName: WaterandJugProblem
 * Description: 水壶问题
 * Author:   @VirtualChen
 * Date:     2019/3/18 0018 上午 9:51
 */

/**
 * z是x和y的最大公约数的倍数即可
 */
public class WaterandJugProblem {
    public boolean canMeasureWater(int x, int y, int z) {
        int key = Findmax(x, y);
        if (z > (x + y)) {
            return false;
        }
        if(z==0){
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
