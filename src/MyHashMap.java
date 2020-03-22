import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * FileName: DesignHashMap
 * Description: 设计哈希映射
 * Author:   @VirtualChen
 * Date:     2019/2/26 0026 上午 9:34
 */

public class MyHashMap {
    /**
     * 超时
     */
//   private List<Integer> list1;
//   private List<Integer> list2;
//
//    /** Initialize your data structure here. */
//    public MyHashMap() {
//        list1=new LinkedList<>();
//        list2=new LinkedList<>();
//    }
//
//    /** value will always be non-negative. */
//    public void put(int key, int value) {
//        if(list1.contains(key)){
//            int i=0;
//            for(i;i<list1.size();i++){
//                if(list1.get(i)==key){
//                    break;
//                }
//            }
//            list2.set(i,value);
//        }else{
//            list1.add(key);
//            list2.add(value);
//        }
//
//    }
//
//    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
//    public int get(int key) {
//        if(list1.contains(key)){
//            int i=0;
//            for(i;i<list1.size();i++){
//                if(list1.get(i)==key){
//                    break;
//                }
//            }
//             return list2.get(i);
//        }else{
//            return -1;
//        }
//    }
//
//    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
//    public void remove(int key) {
//        if(list1.contains(key)){
//            int i=0;
//            for(i;i<list1.size();i++){
//                if(list1.get(i)==key){
//                    break;
//                }
//            }
//            list1.remove(i);
//            list2.remove(i);
//        }
//
//    }
    private int[] Arr=new int[1000001];

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        Arrays.fill(Arr,-1);

    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        Arr[key] = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        return Arr[key];
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        Arr[key] = -1;
    }
}
