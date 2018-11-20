/**
 * 爬楼梯
 * @author Administrator
 *
 */
public class ClimbingStairs {
	/*
	 * 用了递归，超时
	 */
	public int climbStairs(int n) {
    	return ss(n);
    }
    public int ss(int a)
    {
    	if(a>2)
    	{
    		return ss(a-1)+ss(a-2);
    	}
    	else if(a==2)
    	{
    		return 2;
    	}
    	else if(a==1)
    	{
    		return 1;
    	}
        
    	return 0;
    }
    /*
     * 迭代
     */
    public int climbStairs2(int n) {
    	int[] a=new int [n+2];
    	a[1]=1;
    	a[2]=2;
    	for(int i=3;i<n+1;i++)
    	{
    		a[i]=a[i-1]+a[i-2];
    	}
    	return a[n];
    }
}
