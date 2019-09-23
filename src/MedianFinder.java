import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/19 19:16
 * @Description:设计一个支持以下两种操作的数据结构： void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 * double findMedian() - 返回目前所有元素的中位数。
 */
public class MedianFinder {
    /**
     * initialize your data structure here.
     */
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;//大顶堆

    public MedianFinder() {
        min = new PriorityQueue<>();//小顶堆
        max = new PriorityQueue<>(11, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    public void addNum(int num) {
        if ((min.size() + max.size()) % 2 == 0) {
            if (max.size() > 0 && max.peek() > num) {
                max.offer(num);
                num = max.poll();
            }
            min.offer(num);
        } else {
            if (min.size() > 0 && min.peek() < num) {
                min.offer(num);
                num = min.poll();
            }
            max.offer(num);
        }
    }

    public double findMedian() {
        int size = max.size() + min.size();
        if (size == 0) {
            throw new RuntimeException();
        }
        double median = 0;
        if (size % 2 == 0) {
            median = (min.peek() + max.peek()) / 2.0;
        } else {
            median = min.peek();
        }
        return median;
    }
}
