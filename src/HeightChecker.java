import java.util.Arrays;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/6/26 10:13
 * @Description:学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * <p>
 * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int [] heightsBack=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            heightsBack[i]=heights[i];
        }
        Arrays.sort(heightsBack);
        int num = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!=heightsBack[i]){
                num++;
            }
        }
        return num;
    }
}
