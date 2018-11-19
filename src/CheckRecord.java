
public class CheckRecord {
	public boolean checkRecord(String s) {
		int n=0;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)=='A')
	    	{
	    		n++;
	    	}
	    	if(n>=2)
	    	{
	    		return false;
	    	}
	    	else
	    	{
	    		if(s.charAt(i)=='L'&&i+1<s.length())
	    		{
	    			if(s.charAt(i+1)=='L'&&i+2<s.length())
	    				if(s.charAt(i+2)=='L')
	    				{
	    					return false;
	    				}
	    		}
	    		
	    	}
    	}
	    return true;
	}
}
