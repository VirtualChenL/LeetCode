/**
 * FileName: Binarysearchtreeanddoublynkedlist
 * Description: 二叉搜索树与双向链表
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向
 * Author:   @VirtualChen
 * Date:     2020/4/17 18:54
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}
    public Node(int _val) {
        val = _val;
    }
    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
package src;

import java.util.LinkedList;
import java.util.Queue;

public class Binarysearchtreeanddoublynkedlist {
    Node head = null;
    Node pre = null;

    /**
     * 中序遍历树,并记录节点信息
     * @param root
     * @return
     */
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return head;
        }
        order(root);
        head.left=pre;
        pre.right=head;
        return head;
    }

    private void order(Node root) {
        if (root == null) {
            return;
        }
        order(root.left);
        root.left = pre;
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        pre = root;
        order(root.right);

    }
}
