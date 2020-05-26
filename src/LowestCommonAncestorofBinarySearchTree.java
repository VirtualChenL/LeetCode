/**
 * FileName: LowestCommonAncestorofBinarySearchTree
 * Description: 二叉搜索树的最近公共祖先
 * Author:   @VirtualChen
 * Date:     2020/5/25 21:22
 */
package src;

public class LowestCommonAncestorofBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
