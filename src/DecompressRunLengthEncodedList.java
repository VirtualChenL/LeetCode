/**
 * FileName: DecompressRunLengthEncodedList
 * Description: 给你一个以行程长度编码压缩的整数列表 nums 。  考虑每对相邻的两个元素 [a, b] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后有 a 个值为 b 的元素。  请你返回解压后的列表
 * Author:   @VirtualChen
 * Date:     2020/2/21 20:20
 */
package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length / 2; i++) {
            for (int k = nums[i * 2]; k > 0; k--) {
                list.add(nums[i * 2 + 1]);
            }
        }
        //ArrayList中规定的泛型是Integer，不能直接转化到int[]
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;

    }
}
