/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/20 16:59
 * @Description:给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），、
 * 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 */
public class findDuplicate {

    /**
     * 二分法
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length - 1;
        while (end >= start) {
            int middle = start + (end - start) / 2;
            int count = countRange(nums, nums.length, start, middle);
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > (middle - start + 1)) {
                end = middle;
            } else {
                start = middle = 1;
            }
        }
        return -1;
    }

    private int countRange(int[] nums, int length, int start, int end) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] >= start && nums[i] <= end) {
                count++;
            }
        }
        return count;
    }

    /**
     * 简化的二分法
     * @param nums
     * @return
     */
    public int findDuplicate2(int[] nums) {
        if (nums.length == 0 || nums == null)
            return 0;
        int low = 1, high = nums.length - 1, mid;
        while (low < high) {  //这个题不好用low+1<high，因为最后结果的两个值无从比较，是基于count的
            mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;
            }
            if (count > mid)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }

    /**
     * 环的相关知识
     * 弗洛伊德的循环寻找算法
     * @param nums
     * @return
     */
    public int findDuplicate3(int[] nums) {
        // 找到相同的值
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        //找到入口的位子
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }

}
