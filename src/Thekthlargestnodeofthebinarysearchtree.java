/**
 * FileName: Thekthlargestnodeofthebinarysearchtree
 * Description: 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点
 * Author:   @VirtualChen
 * Date:     2020/4/28 13:05
 */
package src;

import java.util.ArrayList;
import java.util.List;

public class Thekthlargestnodeofthebinarysearchtree {
    List<Integer> list;
    int num = 0;
    int res;

    public int kthLargest(TreeNode root, int k) {
        list = new ArrayList<>();
        InorderTraver(root);
        return list.get(k - 1);
    }

    /**
     * 中序遍历,保存
     *
     * @param root
     */
    private void InorderTraver(TreeNode root) {
        if (root == null) {
            return;
        }
        InorderTraver(root.right);
        list.add(root.val);
        InorderTraver(root.left);
    }

    /**
     * 中序遍历,提前返回
     *
     * @param root
     */
    private void InorderTraver2(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        InorderTraver(root.right);
        num++;
        if (num == k - 1) {
            res = root.val;
        }
        InorderTraver(root.left);
    }

}
