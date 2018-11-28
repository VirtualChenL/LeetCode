import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * 打家劫舍
 * 动态规划
 * @author VirtualChen 
 *
 */
public class HouseRobber {
	public int rob(int[] nums) {
		if(nums.length<=1)
		{
			return nums.length==0? 0:nums[0];
		}
		List<Integer> list=new LinkedList<>();
		list.add(nums[0]);
		list.add(Math.max(nums[0], nums[1]));
		for(int i=2;i<nums.length;i++)
		{
			list.add(Math.max(nums[i]+list.get(i-2), list.get(i-1)));
		}
		return list.get(list.size()-1);
    }
}
