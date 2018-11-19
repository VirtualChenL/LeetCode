import java.util.ArrayList;
import java.util.List;

/**
 * 返回杨辉三角的某一行
 * @author Administrator
 *
 */
public class PascalTriangleII {
	public List<Integer> getRow(int rowIndex) {
		 List<Integer> list = new ArrayList<>();
		 for (int i = 1; i <= rowIndex+1; i++) 
		 {
	            list.add(1);
	            for (int j = list.size() - 2; j > 0; j--) {
	                list.set(j, list.get(j) + list.get(j - 1));
	            }
		 }
	     return list;     
	}

}
