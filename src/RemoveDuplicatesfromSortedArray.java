import org.w3c.dom.css.ElementCSSInlineStyle;

/**
 * 删除排序数组中的重复项
 * @author Administrator
 *
 */
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		 int k=0;
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]!=nums[k])
				{
					k++;
					nums[k]=nums[i];
				}
			}
			return ++k;
    }
}
