
import java.util.ArrayList;
import java.util.List;
/**
 * 杨辉三角
 * @author Administrator
 *
 */
public class Generate {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<>();
        if (numRows <= 0) 
        	{
        	return res;
        	}
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            list.add(1);
            for (int j = list.size() - 2; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
            res.add(new ArrayList<>(list));
        }
        return res;
	}
}
