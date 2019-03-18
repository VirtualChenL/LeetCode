/**
 * FileName: SuperUglyNumber
 * Description: 超级丑数
 * Author:   @VirtualChen
 * Date:     2019/3/18 0018 上午 9:11
 */

public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int start=1;
        int[] answer=new int[n];
        if(n==1){
            return 1;
        }
        answer[0]=1;
        int[] k=new int [primes.length];
        int index=1;
        while(index<n){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<primes.length;i++){
                min=Math.min(min,primes[i]*answer[k[i]]);
            }
            for(int i=0;i<primes.length;i++){
                if(primes[i]*answer[k[i]]==min){
                    k[i]++;
                }
            }
            answer[index]=min;
            index++;
        }
        return answer[n-1];
    }
}
