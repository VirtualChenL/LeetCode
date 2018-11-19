import java.util.LinkedList;
import java.util.List;

/**
 * 反转字符串中的元音字母
 * @author Administrator
 *
 */
public class ReverseVowels {
	public String reverseVowels(String s) {
		List<Integer> list=new LinkedList<>();
		StringBuffer buffer=new StringBuffer();
		StringBuffer buffer2=new StringBuffer(s);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
					||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				list.add(i);
				buffer.append(s.charAt(i));
			}
		}
		buffer.reverse();
		for(int i=0;i<list.size();i++)
		{
			buffer2.setCharAt(list.get(i), buffer.toString().charAt(i));
		}
		return buffer2.toString();
    }
}
