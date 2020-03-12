/**
 * FileName: Printfrom1tomaximumndigits
 * Description: 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * Author:   @VirtualChen
 * Date:     2020/2/21 21:29
 */
package src;

import java.util.ArrayList;
import java.util.List;

public class Printfrom1tomaximumndigits {
    public int[] printNumbers(int n) {
        int[] ans=new int[(int) (Math.pow(10,n)-1)];
        for(int i=0;i<Math.pow(10,n)-1;i++){
            ans[i]=i+1;
        }
        return ans;
    }
}
