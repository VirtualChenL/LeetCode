/**
 * FileName: FindNumberswithEvenNumberofDigits
 * Description: 给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 * Author:   @VirtualChen
 * Date:     2020/2/21 21:08
 */
package src;

public class FindNumberswithEvenNumberofDigits {
    public int findNumbers(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            if (s.length() % 2 == 0) {
                n++;
            }
        }
        return n;
    }

    public int findNumbers2(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            int k = 0;
            while (nums[i]  > 0) {
                nums[i] = nums[i] / 10;
                k++;
            }
            if ( k % 2 == 0) {
                n++;
            }
        }
        return n;
    }
}
