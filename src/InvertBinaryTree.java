/**
 * FileName: InvertBinaryTree
 * Description: 翻转二叉树
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 下午 8:13
 */

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        TreeNode newTree = root;
        if (root == null || root.equals(null)) {
            return newTree;
        }
        exchange(newTree);
        return newTree;

    }

    public void exchange(TreeNode root) {
        if (root.right == null && root.left == null) {
            return;
        } else {
            TreeNode tem = root.left;
            root.left = root.right;
            root.right = tem;
        }
        if (root.left != null) {
            exchange(root.left);
        }
        if (root.right != null) {
            exchange(root.right);
        }
    }
}
