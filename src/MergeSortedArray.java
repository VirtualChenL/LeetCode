import java.util.Arrays;

/**
 * 合并两个有序数组
 * @author Administrator
 *
 */
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=0;i<n;i++)
		{
			nums1[m+i]=nums2[i];
		}
		Arrays.sort(nums1);
		for(int i=0;i<m+n;i++)
		{
			System.out.print(nums1[i]);
		}
    }
}
