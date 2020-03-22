/**
 * FileName: MinimumNumberOfK
 * Description:最小的k个数
 * 输入整数数组 arr ，找出其中最小的 k 个数。
 * 例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * Author:   @VirtualChen
 * Date:     2020/3/20 20:18
 */
package src;

import java.util.Arrays;

public class MinimumNumberOfK {
    /**
     * Array的排序函数
     * 时间复杂度O(nlogn)
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

//    public int[] getLeastNumbers2(int[] arr, int k) {
//        int len=arr.length;
//        if(k>=0||k>len){
//            return new int[0];
//        }
//        int left=0;
//        int right=len-1;
//        int targrt=len-1;
//        while (true){
//
//        }
//    }
}
