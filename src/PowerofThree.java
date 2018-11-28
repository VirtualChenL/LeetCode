/**
 * 3的幂
 * @author VirtualChen 
 *
 */
public class PowerofThree {
	 public boolean isPowerOfThree(int n) {
		 if(n<=0)
		    {
		        return false;
		    }
		    int max3Power=(int)Math.pow(3,(int)(Math.log(Integer.MAX_VALUE)/Math.log(3)));
		    if (max3Power%n==0)
		    {
		        return true;
		    }
		    else
		    {
		        return false;
	
		    }
	 }
}
