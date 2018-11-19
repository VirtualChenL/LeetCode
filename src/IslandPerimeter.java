/**
 * 岛屿的周长
 * @author Administrator
 *
 */
public class IslandPerimeter {
	public String reverseStr(String s, int k) {
		StringBuffer buffer=new StringBuffer();
		int i=0;
        for( i=0;i+2*k<s.length();i=i+2*k)
        {
    		  StringBuffer buffer2=new StringBuffer();
    		  buffer2.append(s.substring(i, i+k));
    		  buffer.append(buffer2.reverse().toString());
    		  buffer.append(s.substring(i+k,i+2*k));
    		  
        }
       // i=i-2*k;
        if((s.length()-i)>k)
        {
        	StringBuffer buffer2=new StringBuffer();
        	buffer2.append(s.substring(i,i+k));
        	buffer.append(buffer2.reverse().toString());
  		    buffer.append(s.substring(i+k,s.length()));
        }
        else 
        {
        	StringBuffer buffer2=new StringBuffer();
        	buffer2.append(s.substring(i,s.length()));
        	buffer.append(buffer2.reverse().toString());
        }
        return buffer.toString();
    }
}
