import java.util.Arrays;

/**
 * FileName: NonoverlappingIntervals
 * Description: 无重叠区间
 * Author:   @VirtualChen
 * Date:     2019/3/5 0005 下午 3:14
 */

public class NonoverlappingIntervals {
    public int eraseOverlapIntervals(Interval[] intervals) {
        if(intervals.length<=1){
            return 0;
        }
        Arrays.sort(intervals,(a,b)->a.end-b.end);
        int count=1;
        int end=intervals[0].end;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i].start<end){
                continue;
            }
            count++;
            end=intervals[i].end;
        }
        return intervals.length-count;
    }
}
