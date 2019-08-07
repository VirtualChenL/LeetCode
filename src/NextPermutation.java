import java.util.Arrays;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/30 09:37
 * @Description:下一个排列 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须原地修改，只允许使用额外常数空间。
 */
public class NextPermutation {
    /**
     * 从后往前遍历，找到第一个下降的点，进行交换，然后对后续数组进行排序
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        int temp;
        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    Arrays.sort(nums, i + 1, nums.length);
                    return;
                }
            }
        }
        Arrays.sort(nums);
    }
}
