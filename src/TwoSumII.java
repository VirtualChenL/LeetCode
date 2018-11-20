/**
 * 两数和，有序数组
 * @author Administrator
 *
 */
public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int[] result=new int[2];
		int i=0;
		int j=numbers.length-1;
		while(i<=j)
		{
			if(numbers[i]+numbers[j]==target&&i!=j)
			{
				result[0]=i+1;
				result[1]=j+1;
				break;
			}
			else if(numbers[i]+numbers[j]<target)
			{
				i++;
			}
			else 
			{
				j--;
			}
		}
		return result;
    }
}
