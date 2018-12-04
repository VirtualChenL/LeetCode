import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 三数之和
 * @author VirtualChen 
 *
 */
public class Sum3 {
	/**
	 * 时间复杂度O（n3），会超时
	 * @param nums
	 * @return
	 */
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>>list  =new LinkedList<>();
    	Set<List<Integer>> set=new HashSet<>();
    	if(nums.length<3)
    	{
    		return list;
    	}
    	for(int i=0;i<nums.length;i++)
    	{
    		
    		for(int j=i+1;j<nums.length;j++)
    		{
    			for(int k=j+1;k<nums.length;k++)
    			{
    				if(nums[i]+nums[j]+nums[k]==0&&i!=j&&i!=k&&j!=k)
    				{
    					int[] current=new int[3];
    					current[0]=nums[i];
    					current[1]=nums[j];
    					current[2]=nums[k];
    					Arrays.sort(current);
    					List<Integer> list2=new LinkedList<>();
    					list2.add(current[0]);
    					list2.add(current[1]);
    					list2.add(current[2]);
    					set.add(list2);
    				}
    			}
    		}
    	}
    	for(List<Integer> ss:set)
    	{		
			list.add(ss);
    	}
    	return list;
    }
   /**
    * 对于三元组，如果出现重复，则表示三元中至少有一个元素出现了两次，因而我们先进行排序，则重复的数字是连续的
    * 时间复杂度O(nlogn)+O(n^2)
    */
    public List<List<Integer>> threeSum2(int[] nums) {
    	List<List<Integer>>list  =new LinkedList<>();
    	int target=0;
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++)
    	{
    		if(i>0&&nums[i-1]==nums[i]) continue;
    		for(int j=i+1,k=nums.length-1;j<k;)
    		{
    			if(j>i+1&&nums[j-1]==nums[j])
    			{
    				j++;
    				continue;
    			}
    			if(k<nums.length-1&&nums[k]==nums[k+1])
    			{
    				k--;
    				continue;
    			}
    			int sum=nums[i]+nums[j]+nums[k];
    			if(sum>target) --k;
    			else  if(sum<target) j++;
    			else
    			{
    				List<Integer> list2=new LinkedList<>();
    				list2.add(nums[i]);
    				list2.add(nums[j++]);
    				list2.add(nums[k--]);
    				list.add(list2);
    			}
				
    		}
    	}
    	return list;
    }
}
