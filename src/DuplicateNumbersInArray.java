/**
 * FileName: DuplicateNumbersInArray
 * Description:
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字
 * <p>
 * Author:   @VirtualChen
 * Date:     2020/3/12 21:17
 */
package src;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumbersInArray {
    /**
     * 先数组排序在遍历
     * 时间复杂度O(nlogn)主要为排序所花的时间  空间复杂度O(1)
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        int k = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (k == nums[i]) {
                return k;
            } else {
                k = nums[i];
            }
        }
        return k;
    }

    /**
     * 使用哈希表来解决
     * 时间复杂度O(n)  空间复杂度O(n)
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber2(int[] nums) {
        int hs[] = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            if (hs[nums[i]] == 0) {
                hs[nums[i]] = 1;
            } else {
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * 从头到尾遍历每个数字.当扫描到下标为i的数字时,首先比较这个数字m是不是等于i,如果是,继续扫描下一个,如果不是,
     * 将m和下标为m的数字进行比较,如果相同,则表明m重复,如果不同,则交换下标为m和i两个位置的数字,使m放到属于他的位置,
     * 然后重复进行该操作.
     * 时间复杂度O(n)  空间复杂度O(1)
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber3(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                } else {
                    int k = nums[i];
                    nums[i] = nums[k];
                    nums[k] = k;
                }
            } else {
                i++;
            }
        }
        return 0;
    }

    /**
     * Q:  如果不允许需改数组,且不使用O(n)的辅助空间,怎么完成?
     * A:通过二分查找的,将数组从中间(大小)的数字m分成两半,如果没有重复的数字,则1-m共有m个数字,
     * 当他超过m个数字的时候,就意味着这其中必定有重复的数字
     * 时间复杂度O(nlogn)  空间复杂度O(1)
     * @param nums
     * @return
     */
    public int findRepeatNumber4(int[] nums) {
        int len = nums.length;
        if (len <= 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            int count = countRange(nums, len, start, mid);
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > (mid - start + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int countRange(int[] nums, int len, int start, int end) {
        if (nums == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= start && nums[i] <= end) {
                count++;
            }
        }
        return count;
    }
}
