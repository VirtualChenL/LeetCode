/**
 * FileName: Symmetricbinarytree
 * Description: 对称的二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的
 * Author:   @VirtualChen
 * Date:     2020/3/29 21:41
 */
package src;

import java.util.LinkedList;
import java.util.Queue;

public class Symmetricbinarytree {
    /**
     * 先求出右子树的镜像在进行对比
     * 时间复杂度较大
     *
     * @param root
     * @return
     */
    public boolean isSymmetric2(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (isSame(root.left, mirrorTree2(root.right))) {//判断左子树和右子树的镜像树是否完全相同
            return true;
        }
        return false;
    }

    //判断两棵树是否完全相同
    private boolean isSame(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isSame(node1.left, node2.left) && isSame(node1.right, node2.right);
    }

    //求树的镜像树
    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode p = queue.poll();
            if (p.right != null) {
                queue.add(p.right);
            }
            if (p.left != null) {
                queue.add(p.left);
            }
            TreeNode tem = p.right;
            p.right = p.left;
            p.left = tem;
        }
        return root;
    }

    /**
     * 递归实现
     *时间复杂度：O(n)
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymCore(root.left, root.right);
    }

    //递归判断左子树的左子树是否等于右子树的右子树&&左子树的右子树是否等于右子树的左子树
    private boolean isSymCore(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return isSymCore(left.left, right.right) && isSymCore(left.right, right.left);
    }

    /**
     * 迭代实现
     * 时间复杂度O(n)
     * @param root
     * @return
     */
    public boolean isSymmetric3(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null || root.left.val != root.right.val) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        TreeNode l = null;
        TreeNode r = null;
        while (!queue.isEmpty()) {
            l = queue.poll();
            r = queue.poll();
            if (l== null && r== null) {
                continue;
            }
            if (l== null || r== null || l.val != r.val) {
                return false;
            }
                queue.add(l.left);
                queue.add(r.right);
                queue.add(l.right);
                queue.add(r.left);

        }
        return true;
    }

}
