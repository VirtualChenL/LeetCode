package src;

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

    //双向链表
    public Node left;
    public Node right;
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
