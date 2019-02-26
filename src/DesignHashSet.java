import java.util.Arrays;

/**
 * FileName: DesignHashSet
 * Description: 设计哈希集合
 * Author:   @VirtualChen
 * Date:     2019/2/26 0026 上午 10:29
 */

public class MyHashSet {
    private int[] Arr = new int[1000001];

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        Arrays.fill(Arr, -1);

    }

    public void add(int key) {
        Arr[key] = 1;
    }

    public void remove(int key) {
        Arr[key] = -1;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        if (Arr[key] == 1) {
            return true;
        }else{
            return false;
        }
    }
}
