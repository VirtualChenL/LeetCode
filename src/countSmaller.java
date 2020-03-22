import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/23 09:09
 * @Description:给定一个整数数组 nums，按要求返回一个新数组 counts。数组 counts 有该性质：
 * counts[i] 的值是  nums[i] 右侧小于 nums[i] 的元素的数量。
 */
public class countSmaller {
    /**
     * 暴力，超时，O（n2）
     * @param nums
     * @return
     */
    public List<Integer> countSmaller(int[] nums) {

        int l = nums.length - 1;
        List<Integer> ans = new LinkedList<>();
        for (int i = 0; i <= l; i++) {
            ans.add(smaller(nums, i, nums[i]));
        }
        return ans;
    }
    public static int smaller(int [] nums,int start,int key){
        int cal=0;
        for(int i=start;i<nums.length;i++){
            if(nums[i]<key){
                cal++;
            }
        }
        return cal;
    }



    /**
     * 二分法
     * @param nums
     * @return
     */
    public static List<Integer> countSmaller2(int[] nums) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int len = nums.length;
        Integer[] result = new Integer[len];
        for (int i = len - 1; i >= 0; i--) {
            //将每个数插入到list中//使用二分查找
            int start = 0;
            int end = list.size();

            while (start < end) {
                int middle = start + (end - start) / 2;
                //判断中间的数
                if (list.get(middle) < nums[i]) {//严格小于的话，只能在后面部分，并且不包含middle
                    start = middle + 1;
                } else {
                    end = middle;
                }
            }
            result[i] = start;
            list.add(start, nums[i]);
        }
        return Arrays.asList(result);
    }

    /**
     * 使用btree
     * @param nums
     * @return
     */
    public static  List<Integer> countSmaller3(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        int min = Integer.MAX_VALUE; // nums数组最小值
        for (int value : nums) {
            if (value < min) {
                min = value;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - min + 1;
        }

        int max = Integer.MIN_VALUE;
        for (int value : nums) {
            if (value > max) {
                max = value;
            }
        }

        int[] BITree = new int[max + 1];
        BITree[0] = 0;
        int[] countArr = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int count = getSum(nums[i] - 1, BITree);
            countArr[i] = count;
            update(nums[i], BITree);
        }
        List<Integer> result = new ArrayList<>();
        for (int value : countArr) {
            result.add(value);
        }
        return result;
    }

    public static int getSum(int value, int[] BITree) { // 获得a[i]从1，value的和
        int sum = 0;
        while (value > 0) {
            sum += BITree[value];
            value -= (value & -value);
        }
        return sum;
    }

    public static void update(int value, int[] BITree) {
        while (value <= BITree.length - 1) {
            BITree[value] += 1;
            value += (value & -value);
        }
    }
}
