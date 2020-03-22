/**
 * FileName: Minimumnumberofrotationarray
 * Description:旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，
 * 输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 * Author:   @VirtualChen
 * Date:     2020/3/19 21:36
 */
package src;

public class Minimumnumberofrotationarray {
    /**
     * 遍历对比
     * 时间复杂度O(n)
     *
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < ans) {
                ans = numbers[i];
            }
        }
        return ans;
    }

    /**
     * 使用二分法来降低时间复杂度,
     * 但使用二分法 当 start end mid三个值相等时,将无法继续二分,然后在调用遍历判断大小
     *
     * @param numbers
     * @return
     */
    public int minArray2(int[] numbers) {
        if (numbers.length == 1) {
            return numbers[0];
        }
        int start = 0;
        int end = numbers.length - 1;
        int mid = 0;
        while (numbers[start] >= numbers[end]) {
            if (end - start == 1) {
                mid = end;
                break;
            }
            mid = (start + end) / 2;
            if (numbers[mid] == numbers[start] && numbers[mid] == numbers[end]) {
                return inorder(numbers, start, end);
            }
            if (numbers[mid] >= numbers[start]) {
                start = mid;
            } else if (numbers[mid] <= numbers[end]) {
                end = mid;
            }
        }
        return numbers[mid];
    }

    private int inorder(int[] numbers, int start, int end) {
        int k = numbers[start];
        for (int i = start + 1; i <= end; i++) {
            k = k < numbers[i] ? k : numbers[i];
        }
        return k;
    }
}
