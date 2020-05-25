/**
 * FileName: Adigitinasequenceofdigits
 * Description: 数字序列中某一位的数字
 * Author:   @VirtualChen
 * Date:     2020/4/24 11:10
 */
package src;

public class Adigitinasequenceofdigits {
    public int findNthDigit(int n) {
        if (n<10)
            return n;
        int i = 1;
        while (n>i*(Math.pow(10,i-1))*9){   //循环结束后,i-1就是位数,n-1为表示还要找多少个
            n -= i*Math.pow(10,i-1)*9;
            i++;
        }
        char[] result = String.valueOf((int) Math.pow(10,i-1) + (n-1) / i).toCharArray();//我们用字符串来接收值，方便找位数 result结果为我们要的那个数的
        int value = result[(n-1)%i]-'0';    //(n-1)%位数 得出我们要的第x位的数
        return value;

    }
}
