/**
 * 移动零
 * @author cleverchen
 *
 */
public class MoveZeroes {
	  public void moveZeroes(int[] nums) {
		  for(int i=0;i<nums.length;i++)
	        if(nums[i]==0)
	        {
	        	for(int j=i;j<nums.length;j++)
	        	{
	        		if(nums[j]!=0)
	        		{
	        		    nums[i]=nums[j];
	        		    nums[j]=0;
	        		    break;
	        		}
	        	}
	        }
		  for(int num:nums)
			  System.out.println(num);
	    }

}
