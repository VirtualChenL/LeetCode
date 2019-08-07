/**
 * @Auther: VirtualChen601
 * @Date: 2019/8/6 16:24
 * @Description: 乘积最大子序列
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                int tem=max;
                max=min;
                min=tem;
            }
            max=Math.max(max*nums[i],nums[i]);
            min=Math.min(min*nums[i],nums[i]);

            ans=Math.max(max,ans);
        }
        return ans;
    }
}
