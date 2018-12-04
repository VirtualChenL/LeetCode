/**
 * 打乱数组
 * @author VirtualChen 
 *
 */
public class ShuffleanArray {
	 private int[] orgn;
	 private int[] cur;
	 public Solution(int[] nums) {
	        orgn=nums;
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	        return orgn;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    
	    /*
	     * sort法打乱顺序
	     */
	    public int[] shuffle() {
	        int len=orgn.length;
	        cur=new int[len];
	        for(int i=0;i<len;i++)
	        {
	        	cur[i]=orgn[i];
	        }
	        while(len!=0)
	        {
	        	int  j=(int)Math.floor(Math.random()*len--);
	        	int k=cur[len];
	        	cur[len]=cur[j];
	        	cur[j]=k;
	        }
	        return cur;
	    }
	    /*
	     * 循环随机位交换法
	     * 遍历数组，每次遍历产生一个随机数，表示本次要交换的位子
	     * 将当前位子和要交换的位子的数字交换
	     */
	    public int[] shuffle2() {
	    	 int len=orgn.length;
		        cur=new int[len];
		        for(int i=0;i<len;i++)
		        {
		        	cur[i]=orgn[i];
		        }
	    	for(int i=0;i<orgn.length;i++)
	    	{
	    		int currentRandom=(int)(Math.random()*(len-1));
	    		int current=cur[i];
	    		cur[i]=cur[currentRandom];
	    		cur[currentRandom]=current;
	    	}
	    	return cur;
	    }
}
