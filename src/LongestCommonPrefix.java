/**
 * 最长公共前缀
 * @author VirtualChen 
 *
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		StringBuffer buffer=new StringBuffer();
		int min_len=Integer.MAX_VALUE;
		int k=0;
		if(strs.length==0)
		{
			return "";
		}
		else
		{
			for(int i=0;i<strs.length;i++) 
			{
				if(strs[i].length()<min_len)
				{
					min_len=strs[i].length();
					k=i;
				}
			}
		
	outterloop:	for(int i=0;i<min_len;i++)
			{
				for(int j=0;j<strs.length;j++)
				{
					if(strs[j].charAt(i)!=strs[k].charAt(i))
					{
						if(i==0)
						{
							return "";
						}
						break outterloop;
					}
					
				}
			
				buffer.append(strs[k].charAt(i));
			}
			return buffer.toString();
		}
    }
}
