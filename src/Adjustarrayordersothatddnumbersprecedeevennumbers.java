/**
 * FileName: Adjustarrayordersothatddnumbersprecedeevennumbers
 * Description:调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位
 * 于数组的前半部分，所有偶数位于数组的后半部分
 * Author:   @VirtualChen
 * Date:     2020/3/27 21:22
 */
package src;

public class Adjustarrayordersothatddnumbersprecedeevennumbers {
    /**
     * 新建数组,遍历原数组,填充
     * 时间复杂度O(n) 空间复杂度O(n)
     *
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {
        int[] exNums = new int[nums.length];
        int j = 0;
        int k = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                exNums[j++] = nums[i];
            } else {
                exNums[k--] = nums[i];
            }
        }
        return exNums;
    }

    /**
     * 在原数组上进行操作,通过两个索引指向开头和结尾,分别找到偶数和奇数,然后交换位置
     *
     * @param nums
     * @return
     */
    public int[] exchange2(int[] nums) {
        int j = 0;
        int k = nums.length - 1;
        while (j < k) {
            while (nums[j] % 2 == 1 && j < k) {
                j++;
            }
            while (nums[k] % 2 == 0 && j < k) {
                k--;
            }
            if (j < k) {
                int m = nums[j];
                nums[j] = nums[k];
                nums[k] = m;
                j++;
                k--;
            }
        }
        return nums;
    }

}
