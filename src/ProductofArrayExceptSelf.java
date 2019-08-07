/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/5 18:26
 * @Description:给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，
 * 其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 *
 */
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int right=1;//记录当前位置之后的乘积
        int left=1;//保存当前位置之前的乘积
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=left;
            left*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
                ans[i]*=right;
                right*=nums[i];
        }
        return ans;
    }
}
