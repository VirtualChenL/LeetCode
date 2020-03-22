import java.util.List;

/**
 * FileName: Node
 * Description:
 * Author:   @VirtualChen
 * Date:     2019/2/21 0021 下午 12:36
 */

public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
