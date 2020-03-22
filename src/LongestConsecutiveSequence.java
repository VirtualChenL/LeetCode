import java.util.Arrays;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/30 08:58
 * @Description:最长连续序列 给定一个未排序的整数数组，找出最长连续序列的长度。
 * <p>
 * 要求算法的时间复杂度为 O(n)。
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
//        for(int i :nums)
//        System.out.println(i);
        int l = 0;
        int k = 1;
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                k++;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                l = Math.max(k, l);
                k = 1;
            }
        }
        return Math.max(k, l);
    }
}
