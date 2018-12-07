/**
 * 递增的三元子序列
 *
 * @author VirtualChen
 */
public class IncreasingTripletSubsequence {
    /**
     * 利用两个指针，初始化为最大值，如果a大于当前值，则把当前值赋予a，
     * 当前值大于a而小于b时，则把该值赋予b，此时组成了一个递增二元序列，
     * 当出现值比b大时，便形成了三元序列
     * @param nums
     * @return
     */
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (a >= nums[i]) {
                a = nums[i];
            } else if (b >= nums[i]) {
                b = nums[i];
            } else {
                return true;
            }
        }
        return false;
    }
}
