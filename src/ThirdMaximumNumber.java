
public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		int n1=Integer.MIN_VALUE;
		int n2=Integer.MIN_VALUE;
		int n3=Integer.MIN_VALUE;
		int k=0;
	    for(int i=0;i<nums.length;i++)
	    {
	    	if(nums[i]>=n1)
	    	{
	    		n1=nums[i];
	    	}
	    }
	    for(int i=0;i<nums.length;i++)
	    {
	    	if(nums[i]>=n2&&nums[i]!=n1)
	    	{
	    		n2=nums[i];
	    	}
	    }
	    for(int i=0;i<nums.length;i++)
	    {
	    	if(nums[i]>=n3&&nums[i]!=n1&&nums[i]!=n2)
	    	{
	    		n3=nums[i];
	    		k=1;
	    	}
	    }
	    if(k==0)
	    {
	    	return n1;
	    }
	    else 
	    {
	    	return n3;
	    }
    }
}
