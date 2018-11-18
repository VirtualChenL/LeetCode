/**
 * 二分法求重复的数字
 * @author cleverchen
 *
 */
public class DuplicateNumber {
	public int findDuplicate(int[] nums) {
		 if (nums.length == 0 || nums == null)
	            return 0;
	        int low = 1, high = nums.length - 1, mid;
	        while (low < high) {  //这个题不好用low+1<high，因为最后结果的两个值无从比较，是基于count的
	            mid = low + (high - low) / 2;
	            int count = 0;
	            for (int i = 0; i < nums.length; i++) {
	                if (nums[i] <= mid)
	                    count++;
	            }
	            if (count > mid)
	                high = mid;
	            else
	                low = mid + 1;
	        }
	        return low;
    }
}
