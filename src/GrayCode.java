import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/5/13 10:43
 * @Description:格雷编码
 */
/**
 关键是搞清楚格雷编码的生成过程, G(i) = i ^ (i/2);
 如 n = 3:
 G(0) = 000,
 G(1) = 1 ^ 0 = 001 ^ 000 = 001
 G(2) = 2 ^ 1 = 010 ^ 001 = 011
 G(3) = 3 ^ 1 = 011 ^ 001 = 010
 G(4) = 4 ^ 2 = 100 ^ 010 = 110
 G(5) = 5 ^ 2 = 101 ^ 010 = 111
 G(6) = 6 ^ 3 = 110 ^ 011 = 101
 G(7) = 7 ^ 3 = 111 ^ 011 = 100
 **/

/*
<<表示左移移，不分正负数，低位补0；
>>表示右移，如果该数为正，则高位补0，若为负数，则高位补1；
>>>表示无符号右移，也叫逻辑右移，即若该数为正，则高位补0，而若该数为负数，则右移后高位同样补0
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new LinkedList<>();
        for(int i=0;i<1<<n;i++){
            res.add(i^i>>1);

        }
        return res;
    }
}
