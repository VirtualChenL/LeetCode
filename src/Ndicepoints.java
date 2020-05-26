/**
 * FileName: Ndicepoints
 * Description: n个骰子的点数
 * Author:   @VirtualChen
 * Date:     2020/4/30 18:02
 */
package src;

public class Ndicepoints {
    /**
     * 动态规划
     * @param n
     * @return
     */
    public double[] twoSum(int n) {
        int [][]dp = new int[n+1][6*n+1];
        //边界条件
        for(int s=1;s<=6;s++)dp[1][s]=1;
        for(int i=2;i<=n;i++){
            for(int s=i;s<=6*i;s++){
                //求dp[i][s]
                for(int d=1;d<=6;d++){
                    if(s-d<i-1)break;//为0了
                    dp[i][s]+=dp[i-1][s-d];
                }
            }
        }
        double total = Math.pow((double)6,(double)n);
        double[] ans = new double[5*n+1];
        for(int i=n;i<=6*n;i++){
            ans[i-n]=((double)dp[n][i])/total;
        }
        return ans;

    }
}
