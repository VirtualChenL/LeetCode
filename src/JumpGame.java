/**
 * FileName: JumpGame
 * Description: 跳跃游戏
 * Author:   @VirtualChen
 * Date:     2019/1/7 0007 下午 2:41
 */

public class JumpGame {
    /**
     * 动态规划
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
       int[] dp=new int[nums.length];
       dp[0]=0;
       for(int i=1;i<nums.length;i++){
           dp[i]=Math.max(dp[i-1],nums[i-1])-1;
           if(dp[i]<0){
               return false;
           }
       }
       return true;
    }

    /**
     * 贪婪算法
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        int len=nums.length;
        int Longest=0;
        for(int i=0;i<len;i++){
            if(i>Longest||Longest>=len-1) break;
            Longest=Math.max(Longest,i+nums[i]);
        }
        return Longest>len-1;
    }
}
