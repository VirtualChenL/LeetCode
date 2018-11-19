import java.util.LinkedList;
import java.util.List;

/**
 * 字符的最短间距
 * @author Virtuai.chen
 *
 */
public class ShortestToChar {
	 public int[] shortestToChar(String S, char C) {
		 List<Integer> list=new LinkedList<>();
		 for(int i=0;i<S.length();i++)
		 {
			 if(S.charAt(i)==C)
			 {
				 list.add(i);
			 }
		 }
		 int[] len=new int[S.length()];
		 for(int i=0;i<S.length();i++)
		 {
			 if(S.charAt(i)==C)
			 {
				 len[i]=0;
			 }
			 else 
			 {
				 int min=Integer.MAX_VALUE;
				 for(int k:list)
				 {
					 int l=Math.abs(i-k);
					 min=Math.min(l, min);
				 }
				 len[i]=min;
			 }
		 }
	      return len;  
	 }
}
