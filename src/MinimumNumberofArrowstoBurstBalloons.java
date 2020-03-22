import java.util.Arrays;

/**
 * FileName: MinimumNumberofArrowstoBurstBalloons
 * Description: 用最少数量的箭引爆气球
 * Author:   @VirtualChen
 * Date:     2019/3/5 0005 下午 2:48
 */

/**
 * 求不重叠的区域，边界也不能重叠，贪心算法
 */
public class MinimumNumberofArrowstoBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if(points.length<=1){
            return points.length;
        }
        Arrays.sort(points,(a,b)->a[1]-b[1]);
        int end=points[0][1];
        int cnt=1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]<=end){
                continue;
            }
            end=points[i][1];
            cnt++;
        }
        return cnt;
    }
}
