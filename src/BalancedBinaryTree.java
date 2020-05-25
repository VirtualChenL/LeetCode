package src;

import java.util.LinkedList;
import java.util.Queue;

/**
 * FileName: BalancedBinaryTree
 * Description: 平衡二叉树
 * Author:   @VirtualChen
 * Date:     2018/12/24 0024 下午 3:24
 */

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isBalancedOdRoot(root) && isBalancedOdRoot(root.left) && isBalancedOdRoot(root.right);
    }

    private boolean isBalancedOdRoot(TreeNode p) {
        if (p == null) {
            return true;
        }
        int leftH = TreeHeight(p.left);
        int rightH = TreeHeight(p.right);
        if (Math.abs(leftH - rightH) <= 1) {
            return true;
        }
        return false;
    }

    private int TreeHeight(TreeNode p) {
        if (p == null) {
            return 0;
        }
        return Integer.max(TreeHeight(p.right), TreeHeight(p.left)) + 1;
    }


    /**
     * 后序遍历+剪枝
     * @param root
     * @return
     */
    public boolean isBalanced1(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

}
