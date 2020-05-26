/**
 * FileName: LowestCommonAncestorofaBinaryTree
 * Description: 二叉树的最近公共祖先
 * Author:   @VirtualChen
 * Date:     2020/5/25 21:35
 */
package src;

import java.util.Stack;

public class LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? lowestCommonAncestor(root.right,p,q) : lowestCommonAncestor(root.left,p,q);
    }
}
