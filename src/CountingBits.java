/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/1 09:33
 * @Description:给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 */
public class CountingBits {
    public int[] countBits(int num) {
        int dp[] = new int[num+1];
        for (int i = 0; i <= num/2; i++) {
            dp[i*2] = dp[i];
            if(i*2+1 <= num)
                dp[i*2+1] = dp[i] + 1;
        }
        return dp;
    }
}
