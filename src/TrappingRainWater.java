/**
 * FileName: TrappingRainWater
 * Description: 接雨水
 * Author:   @VirtualChen
 * Date:     2019/3/18 0018 上午 10:44
 */

public class TrappingRainWater {
    public int trap(int[] height) {
        /**
         * 超时
         */
     /*   int maxheight = 0;
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            maxheight = Math.max(maxheight, height[i]);
        }
        for (int i = 0; i < maxheight; i++) {
            int[] tem = new int[height.length];
            int k = 0;
            for (int j = 0; j < height.length; j++) {
                if (height[j] > i) {
                    tem[k++] = j;
                }
            }
            for (int j = 1; j < tem.length && tem[j] != 0; j++) {
                ans += tem[j] - tem[j - 1] - 1;
            }
        }
        return ans;*/
        if (height.length < 3) {
            return 0;
        }
        int res = 0;
        int hl = height[0];
        int hr = height[height.length - 1];
        int nl = 1;
        int nr = height.length - 2;
        while (nl <= nr) {
            if (hl <= hr) {
                if (hl < height[nl]) {
                    hl = height[nl];
                } else {
                    res += hl - height[nl];
                }
                nl++;
            } else {
                if (hr < height[nr]) {
                    hr = height[nr];
                } else {
                    res += hr - height[nr];
                }
                nr--;
            }
        }
        return res;
    }
}
