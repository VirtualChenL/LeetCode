import java.util.Vector;

/**
 * FileName: UglyNumberII
 * Description: 丑数 II
 * Author:   @VirtualChen
 * Date:     2019/3/15 0015 上午 9:24
 */

public class UglyNumberII {
    public int nthUglyNumber(int n) {
        int start=1;
        int [] answer=new int[n];
        answer[0]=1;
        if(n==1){
            return 1;
        }
        int index=1;
        int p2,p3,p5;
        p2=p3=p5=0;
        while(index<n){
            answer[index]=(Math.min(Math.min(2*answer[p2],3*answer[p3]),5*answer[p5]));
            if(answer[p2]*2==answer[index]) p2++;
            if(answer[p3]*3==answer[index]) p3++;
            if(answer[p5]*5==answer[index]) p5++;
            index++;
        }
        return answer[n-1];
    }
}
