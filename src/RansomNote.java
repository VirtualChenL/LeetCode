import java.util.ArrayList;
import java.util.List;

/**
 * 赎金信
 * @author Administrator
 *
 */
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		List<Character> list =new ArrayList<>();
		list.add('1');
		if(magazine.length()<ransomNote.length())
		{
			return false;
		}
		else
		{
			for(int i=0;i<magazine.length();i++)
			{
				list.add(magazine.charAt(i));
			}
			for(int i=0;i<ransomNote.length();i++)
			{
				if(list.contains(ransomNote.charAt(i)))
				{
					for(int j=0;j<list.size();j++)
					{
						if(list.get(j)==ransomNote.charAt(i))
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
