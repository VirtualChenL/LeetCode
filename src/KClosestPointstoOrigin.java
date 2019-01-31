import java.util.Arrays;

/**
 * 最接近原点的 K 个点
 * @author VirtualChen
 *
 */
public class KClosestPointstoOrigin {
	 public int[][] kClosest(int[][] points, int K) {
		 int[] dists=new int [points.length];
		 for(int i=0;i<points.length;i++) {
			 dists[i]=points[i][0]*points[i][0]+points[i][1]*points[i][1];
		 }
		 Arrays.sort(dists);
		 int DK=dists[K-1];
		 
		 int[][]answer=new int[K][2];
		 int t=0;
		 for(int i=0;i<points.length;i++) {
			 if((points[i][0]*points[i][0]+points[i][1]*points[i][1])<=DK)
			 {
				 answer[t++]=points[i];
			 }
		 }
		 return answer;
	 }
}
