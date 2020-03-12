/**
 * FileName: SubtracttheProductandSumofDigitsofanInteger
 * Description: 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * Author:   @VirtualChen
 * Date:     2020/2/21 21:01
 */
package src;

public class SubtracttheProductandSumofDigitsofanInteger {
    public int subtractProductAndSum(int n) {
            int mul=1;
            int sum=0;
           while(n>0){
               mul*=n%10;
               sum+=n%10;
               n=n/10;
           }
           return mul-sum;
    }
}
