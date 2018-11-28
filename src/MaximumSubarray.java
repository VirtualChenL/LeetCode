import java.util.LinkedList;
import java.util.List;


/**
 * 最大子序和
 * @author VirtualChen 
 *
 */
public class MaximumSubarray {
	/*
	 * 暴力破解
	 * O(n2)
	 */
	public int maxSubArray(int[] nums) {
		List<Integer> list=new LinkedList<>();
		int sum;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			sum=0;
			for(int j=i;j<nums.length;j++)
			{
				sum+=nums[j];
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		return max;
    }
	/*
	 * 扫描法
	 */
	public int maxSubArray2(int[] nums) {
		int current=nums[0];
		int sum=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			if(current<0) 
			{
				current=nums[i];
			}
			else
			{
				current+=nums[i];
			}
			if(current>sum)
			{
				sum=current;
			}
		}
		return sum;
	}
	
}
