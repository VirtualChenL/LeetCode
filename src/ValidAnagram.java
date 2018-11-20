import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 有效的字母异位词
 * @author Administrator
 *
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		List<Character> list =new ArrayList<>();
		list.add('1');
		if(s.length()!=t.length())
		{
			return false;
		}
		else
		{
			for(int i=0;i<s.length();i++)
			{
				list.add(s.charAt(i));
			}
			for(int i=0;i<t.length();i++)
			{
				if(list.contains(t.charAt(i)))
				{
					for(int j=0;j<list.size();j++)
					{
						if(list.get(j)==t.charAt(i))
						{
							list.remove(j);
							break;
						}
					}
				}
				else 
				{
					return false;
				}
			}
		}
		return true;
    }
}
