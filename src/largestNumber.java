import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/20 15:48
 * @Description:给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 */
public class largestNumber {
    public String largestNumber(int[] nums) {
        String[] strArr=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strArr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);//直接比结果
            }
        });

        StringBuffer sb=new StringBuffer();
        if(strArr[0].equals("0")){
            return "0";
        }
        for(String s:strArr){
            sb.append(s);
        }
        return sb.toString();
    }
}
