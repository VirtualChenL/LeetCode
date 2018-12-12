
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: MergeIntervals
 * Description: 合并区间
 * Author:   @VirtualChen
 * Date:     2018/12/12 0012 下午 3:46
 */

public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> answer = new LinkedList<>();
        if (intervals.isEmpty()) return answer;
        Collections.sort(intervals, new Comparator<Interval>() {//重写比较器，使Interval按start从小到大排序
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        Interval tem = intervals.get(0);

        if (intervals.size() == 1) {
            answer.add(tem);
            return answer;
        }

        for (int i = 1; i < intervals.size(); i++) {
            if (tem.end >= intervals.get(i).start) {
                tem.end = Math.max(tem.end, intervals.get(i).end);
            } else {
                answer.add(tem);
                tem = intervals.get(i);
            }
        }
        answer.add(tem);
        return answer;
    }
}
