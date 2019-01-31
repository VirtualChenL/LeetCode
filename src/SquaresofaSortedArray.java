import java.util.Arrays;

/**
 * 有序数组的平方
 * @author VirtualChen
 *
 */
public class SquaresofaSortedArray {
	 public int[] sortedSquares(int[] A) {
	       int[] answer=new int[A.length];
	       for(int i=0;i<A.length;i++) {
	    	   answer[i]=A[i]*A[i];
	       }
	       Arrays.sort(answer);
	       return answer;
	    }

}
