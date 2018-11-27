import java.util.HashMap;

/**
 * 字符串中第一个唯一字符
 * @author Administrator
 *
 */
public class FirstUniqueCharacterinaString {
	public int firstUniqChar(String s) {
		HashMap<Character, Integer> map=new HashMap<>();
		int[] nums=new int[26];
		for(int i=0;i<s.length();i++)
		{
			nums[s.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++)
		{
			map.put((char)(97+i), nums[i]);
		}
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i))==1)
			{
				return i;
			}
		}
		return -1;
    }
	
}
