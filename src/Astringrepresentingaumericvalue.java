/**
 * FileName: Astringrepresentingaumericvalue
 * Description:表示数值的字符串
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）
 * 。例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"及"-1E-16"都表示数值，
 * 但"12e"、"1a3.14"、"1.2.3"、"+-5"及"12e+5.4"都不是
 * <p>
 * Author:   @VirtualChen
 * Date:     2020/3/24 21:01
 */
package src;

public class Astringrepresentingaumericvalue {
        /*
        核心: 有效数字的模式只有两种:
        1)A[.[B]][e|EC]  比如: +100   -67.0  29.    3.14E5
        2).B[e|EC]       比如: .3     .4E6
        其中,A、C是整数，B是正整数; [e|EC]表示[eC]或者[EC]
        原则: 有A的话,有没有B都可以; 没有A的话, 必须有B
        */
    int i = 0;

    public boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }
        s = s.trim();
        boolean A = scanInteger(s);
        boolean B = false;
        boolean C = false;
        if (i < s.length() && s.charAt(i) == '.') {
            //i当前指向'.', 所以需要i++
            i++;
            B = scanUnsignedInteger(s);
        }
        //判断是否有C
        if (i < s.length() && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
            i++;
            C = scanInteger(s);
            //如果存在e|E, 但是没有C, 说明不是数字
            if (C == false)
                return false;
        }
        return i == s.length() && (A || B);
    }

    //扫描整数
    private boolean scanInteger(String s) {
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }
        return scanUnsignedInteger(s);
    }

    //扫描正整数
    private boolean scanUnsignedInteger(String s) {
        //起始索引
        int start = i;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            i++;
        }
        //i>start 扫描到了数字
        return i > start;

    }
}
