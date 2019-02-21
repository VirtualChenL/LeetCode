import java.util.LinkedList;
import java.util.List;

/**
 * FileName: NumberofRecentCalls
 * Description: 最近的请求次数
 * Author:   @VirtualChen
 * Date:     2019/2/21 0021 上午 11:05
 */

public class RecentCounter {
    private List<Integer> list;
    private int minIndex = 0;

    public RecentCounter() {
        list = new LinkedList<>();
    }

    public int ping(int t) {
        list.add(t);
        for (int i = minIndex; i < list.size(); i++) {
            if (list.get(i) < (t - 3000)) {
                minIndex++;
            } else {
                break;
            }
        }
        return list.size() - minIndex;
    }
}
