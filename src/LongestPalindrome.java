import java.util.LinkedList;
import java.util.List;
/**
 * 最长回文串
 * @author Administrator
 *
 */
public class LongestPalindrome {
	public int longestPalindrome(String s) {
		int k=0;
		List<Character> list=new LinkedList<>();
		list.add((char)1);
		if(s.length()==1)
		{
			return 1;
		}
		else 
		{
			for(int i=0;i<s.length();i++)
			{
				list.add(s.charAt(i));
			}
	        for(int i=0;i<list.size();i++)
	        {
	    	  for(int j=0;j<list.size();j++)
	    	  {
	    		if(j!=i&&list.get(i)==list.get(j))
	    		{
	    			k++;
	    			list.remove(i);
	    			list.remove(j-1);
	    			i=0;
	    			j=0;
	    			break;
	    		}
	    	  }
	        }
	        if(s.length()-2*k>=1)
	        {
	        	return 2*k+1;
	        }
	        else 
	        {
	        	return 2*k;
	        }
		}
      
    }
}
