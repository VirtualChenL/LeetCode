/**
 * 4的幂
 * @author VirtualChen 
 *
 */
public class PowerofFour {
	 public boolean isPowerOfFour(int num) {
		 if(num<=0)
		    {
		        return false;
		    }
		    int max4Power=(int)Math.pow(4,(int)(Math.log(Integer.MAX_VALUE)/Math.log(4)));
		    if (max4Power%num==0&&(int)Math.sqrt(num)==Math.sqrt(num))
		    {
		        return true;
		    }
		    else
		    {
		        return false;
	
		    }
	 }
	
}
