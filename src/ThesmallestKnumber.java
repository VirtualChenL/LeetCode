/**
 * FileName: ThesmallestKnumber
 * Description:最小的k个数
 * Author:   @VirtualChen
 * Date:     2020/4/20 11:41
 */
package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ThesmallestKnumber {
    /**
     * 先排序.在输出
     * 时间复杂度0(nlogn)
     *
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


    /**
     * 基于快速排序,需要改变输入数组
     * 时间复杂度O(N)
     *
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers1(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] nums, int low, int high, int k) {
        int j = partition(nums, low, high);
        if (j == k) {
            return Arrays.copyOf(nums, j + 1);
        }
        return j > k ? quickSearch(nums, low, j - 1, k) : quickSearch(nums, j + 1, high, k);
    }

    /**
     * 快速排序
     *
     * @param nums
     * @param low
     * @param high
     * @return
     */
    private int partition(int[] nums, int low, int high) {
        int v = nums[low];
        int i = low;
        int j = high + 1;
        while (true) {
            while (++i <= high && nums[i] < low) ;
            while (--j >= low && nums[j] > low) ;
            if (i >= j) {
                break;
            }
            int t = nums[i];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[low] = nums[j];
        nums[j] = v;
        return j;
    }

    /**
     * 大根堆实现
     *时间复杂度O(NlogK)
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers2(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int num : arr) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num < pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }
        int[] res = new int[pq.size()];
        int idx = 0;
        for (int num : pq) {
            res[idx++] = num;
        }
        return res;
    }

    /**
     * 计数排序
     * 时间复杂度O(N)
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers3(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // 统计每个数字出现的次数
        int[] counter = new int[10001];
        for (int num: arr) {
            counter[num]++;
        }
        // 根据counter数组从头找出k个数作为返回结果
        int[] res = new int[k];
        int idx = 0;
        for (int num = 0; num < counter.length; num++) {
            while (counter[num]-- > 0 && idx < k) {
                res[idx++] = num;
            }
            if (idx == k) {
                break;
            }
        }
        return res;
    }
}
