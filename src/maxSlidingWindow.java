/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/20 15:29
 * @Description:
 */
public class maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0){
            return nums;
        }
        int[] res=new int[nums.length-k+1];
        for(int i=k-1;i<nums.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i-k+1;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            res[i-k+1]=max;
        }
        return res;
    }
}
