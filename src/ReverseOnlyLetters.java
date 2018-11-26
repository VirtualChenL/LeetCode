

public class ReverseOnlyLetters {
	 public boolean judgeSquareSum(int c) {
		 int k=(int)Math.ceil(Math.sqrt(c));
		 for(int i=1;i<=k;i++)
		 {
//			 if(Math.pow(i, 2)+Math.pow(k-i, 2)==c)
//			 {
//				 return true;
//			 }
			 for(int j=1;j<=k;j++)
			 {
				 if(Math.pow(i, 2)+Math.pow(j, 2)==c)
					 return true;
			 }
		 }
		 return false;
	 }
}
