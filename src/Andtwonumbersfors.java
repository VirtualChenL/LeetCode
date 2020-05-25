/**
 * FileName: Andtwonumbersfors
 * Description: 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可
 * Author:   @VirtualChen
 * Date:     2020/4/30 13:41
 */
package src;

public class Andtwonumbersfors {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[0];
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            if (nums[start] + nums[end] > target) {
                end--;
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                return new int[]{nums[start], nums[end]};
            }
        }
        return new int[0];
    }
}
