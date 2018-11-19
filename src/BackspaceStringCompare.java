import java.util.LinkedList;
import java.util.List;

public class BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
		List<Character> list=new LinkedList<>();
		List<Character> list2=new  LinkedList<>();
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)!='#')
			{
				list.add(S.charAt(i));
			}
			else 
			{
				if(list.size()>=1)
				list.remove(list.size()-1);
			}	
		}
		for(int i=0;i<T.length();i++)
		{
			if(T.charAt(i)!='#')
			{
				list2.add(T.charAt(i));
			}
			else 
			{
				if(list2.size()>=1)
				list2.remove(list2.size()-1);
			}	
		}
		if(list.size()!=list2.size())
		{
			return false;
		}
		else 
		{
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i)!=list2.get(i))
				{
					return false;
				}
			}
			return true;
		}
    }
}
