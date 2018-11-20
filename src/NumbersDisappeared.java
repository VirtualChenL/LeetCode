import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 找到所有数组中消失的数字
 * @author Administrator
 *
 */
public class NumbersDisappeared {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list=new LinkedList<>();
		for(int i=0;i<nums.length;i++)
		{
			int k=Math.abs(nums[i]-1);
			nums[k]=(nums[k]>0)? -nums[k] :nums[k];
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>0)
			{
				list.add(i+1);
			}
		}
		return list;
    }
	public List<Integer> findDisappearedNumbers2(int[] nums) {
		List<Integer> list=new LinkedList<>();
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=nums[nums[i]-1])
			{
				int k=nums[i];
				nums[i]=nums[nums[i]-1];
				nums[nums[i]-1]=k;
				i--;
			}
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=i+1)
			{
				list.add(i+1);
			}
		}
		return list;
	}
}
