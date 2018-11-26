import java.util.Arrays;
/**
 * 至少是其他数字两倍的最大数
 * @author Administrator
 *
 */
public class LargestNumberAtLeastTwiceofOthers {
	public int dominantIndex(int[] nums) {
		int[] copy=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			copy[i]=nums[i];
		}
		Arrays.sort(copy);
		if(nums.length>1)
		{
			if(copy[copy.length-1]>=2*copy[copy.length-2])
			{
				for(int i=0;i<nums.length;i++)
				{
					if(nums[i]==copy[copy.length-1])
					{
						return i;
					}
				}
				return -1;
			}
			else
			{
				return -1;
			}
		}
		return 0;
    }
}
