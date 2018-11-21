/**
 * 找到比目标字母大的最小字母
 * @author Administrator
 *
 */
public class FindSmallestLetterGreaterThanTarget {
	 public char nextGreatestLetter(char[] letters, char target) {
		 	for(int i=0;i<letters.length;i++)
		 	{
		 		if(letters[i]+0>target)
		 		{
		 			return letters[i];
		 		}
		 	}
		 	return letters[0];
	    }
}
