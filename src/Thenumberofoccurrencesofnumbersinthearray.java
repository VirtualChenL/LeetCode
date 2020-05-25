/**
 * FileName: Thenumberofoccurrencesofnumbersinthearray
 * Description: 数组中数字出现的次数
 * Author:   @VirtualChen
 * Date:     2020/4/30 13:31
 */
package src;

public class Thenumberofoccurrencesofnumbersinthearray {
    /**
     * 分组位运算
     * @param nums
     * @return
     */
    public int[] singleNumbers(int[] nums) {
        int k = 0;
        for (int num : nums) {
            k ^= num;
        }
        int mask = 1;
        while ((k & mask) == 0) {
            mask <<= 1;
        }

        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
