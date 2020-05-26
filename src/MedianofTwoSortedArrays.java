package src;

/**
 * FileName: MedianofTwoSortedArrays
 * Description: 寻找两个有序数组的中位数
 * Author:   @VirtualChen
 * Date:     2018/12/24 0024 下午 2:32
 */

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int m = 0;
        int n = 0;
        double resultNum;
        int[] answer = new int[len1 + len2];
        for (int i = 0; i < len1 + len2; i++) {
            if (m < len1 && n < len2) {
                if (nums1[m] <= nums2[n]) {
                    answer[i] = nums1[m];
                    m++;
                } else  {
                    answer[i] = nums2[n];
                    n++;
                }
            } else if (m == len1 && n < len2) {
                answer[i] = nums2[n];
                n++;
            } else if (m < len1 && n == len2 ) {
                answer[i] = nums1[m];
                m++;
            }
        }
        if ((len1 + len2) % 2 == 1) {
            resultNum = answer[(len1 + len2) / 2];
        } else {
            resultNum = ((double) answer[(len1 + len2) / 2] + (double) answer[(len1 + len2) / 2 - 1]) / 2;
        }
        return resultNum;
    }
}
