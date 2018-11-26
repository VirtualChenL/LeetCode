/**
 * 猜数字大小
 * @author Administrator
 *
 */
public class GuessNumberHigherorLower {
	public int guessNumber(int n) {
		int t = guess(n);
        if(t==0){
            return n;
         }
        int left = 1,right = n;
        while(left<right)
        {
            int mid = left + (right-left)/2;
            int x = guess(mid);
            if(x==1){
                left = mid;
            }else if(x==-1){
                right = mid;
            }else if(x==0)
            {
                return mid;
	        }
	    }
    }
}
