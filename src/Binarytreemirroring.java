/**
 * FileName: Binarytreemirroring
 * Description:二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 * Author:   @VirtualChen
 * Date:     2020/3/29 21:15
 */
package src;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binarytreemirroring {
    /**
     * 采用递归,不断交换左右子树,直到叶子节点
     *
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.right == null && root.left == null) {
            return root;
        }
        TreeNode node = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(node);
        return root;
    }

    /**
     * 循环实现
     * @param root
     * @return
     */
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

}
