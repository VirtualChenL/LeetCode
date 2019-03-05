/**
 * FileName: JumpGameII
 * Description: 跳跃游戏 II
 * Author:   @VirtualChen
 * Date:     2019/3/5 0005 上午 10:41
 */

public class JumpGameII {
    public int jump(int[] nums) {
        int reach = 0;
        int nextreach = nums[0];
        int step = 0;
        if (nums.length == 0) {
            return step;
        }
        for (int i = 0; i < nums.length; i++) {
            nextreach = Math.max(i + nums[i], nextreach);
            if (nextreach >= nums.length-1) {
                return step + 1;
            }
            //循环 直到i到达前一次最大的reach点
            if (i == reach) {
                step++;
                reach = nextreach;
            }
        }
        return step;
    }
}
