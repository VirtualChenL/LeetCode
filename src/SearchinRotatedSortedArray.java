/**
 * FileName: SearchinRotatedSortedArray
 * Description: 搜索旋转排序数组
 * Author:   @VirtualChen
 * Date:     2018/12/13 0013 上午 9:50
 */

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[r])//寻找分段点
            {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        int answer1 = binary_search(nums, 0, l, target);
        int answer2 = binary_search(nums, l, nums.length - 1, target);
        if (answer1 == -1 && answer2 == -1) {
            return -1;
        } else {
            return answer1 == -1 ? answer2 : answer1;
        }
    }

    public int binary_search(int[] nums, int l, int r, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int low = l;
        int high = r;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
