1-/**z
 * FileName: TargetSum
 * Description: 目标和
 * Author:   @VirtualChen
 * Date:     2019/3/11 0011 上午 9:22
 */

/**
 *                   sum(P) - sum(N) = target
 * sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
 *                        2 * sum(P) = target + sum(nums)
 */
public class TargetSum {
    public int findTargetSumWays(int[] nums, int S){
        int sum=0;
        for(int m:nums){
            sum+=m;
        }
        return sum<S||(S+sum)%2>0?0:setsum(nums,(S+sum)/2);
    }
    public int setsum(int[] nums,int s){
        int [] dp=new int [s+1];
        dp[0]=1;
        for(int n:nums){
            for(int i=s;i>=n;i--){
                dp[i]+=dp[i-n];
            }
        }
        return dp[s];
    }
}
