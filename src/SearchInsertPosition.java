
/**
 * 有序数组插入合适的位子
 * @author Administrator
 *
 */
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int i=0;
		while(i<nums.length)
		{
			if(nums[i]<target)
				i++;
			else {
				break;
			}
		}
		return i;
    }
}
