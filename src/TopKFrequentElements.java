import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: TopKFrequentElements
 * Description: 前K个高频元素
 * Author:   @VirtualChen
 * Date:     2018/12/11 0011 下午 3:48
 */

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            int count=1;
            if(map.containsKey(num))
            {
                count=map.get(num)+1;
            }
            map.put(num,count);
        }
        /**
         * 获取最大频率
         */
        int max=0;
        for(Integer key:map.keySet())
        {
            max=Math.max(max,map.get(key));
        }
        /**
         * 初始化行数为Max+1的二维数组
         */
        List<Integer>[] arr=new LinkedList[max+1];
        for(int i=1;i<=max;i++)
        {
            arr[i]=new LinkedList<Integer>();
        }
        /**
         * 将数字保存到频率对应的行中
         */
        for(int key:map.keySet()){
            int count=map.get(key);
            arr[count].add(key);
        }
        /**
         * 倒序取出二维数组中的数字
         */
        floop:    for(int j=max;j>0;j--){
            if(arr[j].size()>0){
                for(int a:arr[j])
                {
                    list.add(a);
                    if(list.size()==k){
                        break floop;
                    }
                }
            }
        }
        return  list;
    }
}
