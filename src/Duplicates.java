import java.util.LinkedList;
import java.util.List;

/**
 * 数据中重复的数字
 * @author Administrator
 *
 */
public class Duplicates {
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer> list=new LinkedList<>();
		for(int i=0;i<nums.length;++i)
		{
			int k=Math.abs(nums[i])-1;
			if(nums[k]<0) list.add(k+1);
			nums[k]=-nums[k];
		}
		
		return list;
    }
}
