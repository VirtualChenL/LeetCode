/**
 * 移除排序数组中的重复项
 * @author Administrator
 *
 */
public class RemoveDuplicatesfromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		int i = 1, k = 1;
        int count = 1;
            
        if (nums.length <= 2)
            return nums.length;    
            
        for(; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                if(count < 2){
                    nums[k++] = nums[i];
                    count++;
                }
			}
            else {
            	count = 1;
            	nums[k++] = nums[i];
			}
        }
        return k;
	}
}