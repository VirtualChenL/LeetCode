import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/7/3 10:24
 * @Description:假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 */
public class QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
//        Arrays.sort(people, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] x, int[] y) {
//                if (x[0] > y[0]) {
//                    return -1;
//                } else if (x[0] < y[0]) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//
//        int[][] result = new int[people.length][2];
//        result[0][0] = people[0][0];
//        result[0][1] = people[0][1];
//        for (int i = 1; i < people.length; i++) {
//            result[i][0] = people[i][0];
//            result[i][1] = people[i][1];
//            for (int j = i; j > 0; j--) {
//                if (result[j][0] >= result[j - 1][0] && result[j][1] < result[j - 1][1])
//                {
//                    int a = result[j][0];
//                    int b = result[j][1];
//                    result[j][0] = result[j - 1][0];
//                    result[j][1] = result[j - 1][1];
//                    result[j - 1][0] = a;
//                    result[j - 1][1] = b;
//                }else if(  result[j][0]<result[j-1][0]){
//                    int t=i-result[j][1];
//                    System.out.println(t);
//                    for(int k=0;k<t;k++){
//                        int a = result[j-k][0];
//                        int b = result[j-k][1];
//                        result[j-k][0] = result[j - 1-k][0];
//                        result[j-k][1] = result[j - 1-k][1];
//                        result[j - 1-k][0] = a;
//                        result[j - 1-k][1] = b;
//                    }
//                }
//            }
//        }
//        return result;

        if (0 == people.length || 0 == people[0].length)
            return new int[0][0];
        //按照身高降序 K升序排序
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        //K值定义为 排在h前面且身高大于或等于h的人数
        //因为从身高降序开始插入，此时所有人身高都大于等于h
        //因此K值即为需要插入的位置
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[list.size()][]);

    }
}
