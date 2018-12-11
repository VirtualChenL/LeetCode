/**
 * FileName: FindPeakElement
 * Description: 寻找峰值
 * Author:   @VirtualChen
 * Date:     2018/12/11 0011 下午 5:00
 */

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int size = nums.length, low = 0, high = size - 1, mid = 0;
        while (low <= high) {
            mid = (high - low) / 2 + low;
            if (nums[mid] > (mid - 1 < 0 ? Integer.MIN_VALUE : nums[mid - 1]) && nums[mid] > (mid + 1 > size - 1 ? Integer.MIN_VALUE : nums[mid + 1])) {
                return mid;
            } else if (nums[mid] < (mid - 1 < 0 ? Integer.MIN_VALUE : nums[mid - 1])) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
