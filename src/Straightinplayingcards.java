/**
 * FileName: Straightinplayingcards
 * Description:  扑克牌中的顺子
 * Author:   @VirtualChen
 * Date:     2020/5/5 15:58
 */
package src;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Straightinplayingcards {
    /**
     * 先排序在遍历
     *
     * @param nums
     * @return
     */
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zero = 0;
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 0) {
                zero++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (nums[i + 1] - nums[i] > 1) {
                zero = zero - (nums[i + 1] - nums[i]) + 1;
            }
            if (nums[i + 1] == nums[i]) {
                return false;
            }
        }
        if (zero < 0) {
            return false;
        }
        return true;
    }

    /**
     * @param nums
     * @return
     */
    public boolean isStraight1(int[] nums) {
        int min = 15;
        int max = -1;
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 0) continue;
            min = min < nums[i] ? min : nums[i];
            max = max > nums[i] ? max : nums[i];
            if (set.contains(nums[i])) return false;
            set.add(nums[i]);
        }
        return max - min < 5;

    }

}
