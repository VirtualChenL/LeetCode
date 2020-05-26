/**
 * FileName: PrintBinaryTreefromtoptobottomII
 * Description: 从上到下打印二叉树 II
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行
 * Author:   @VirtualChen
 * Date:     2020/4/11 21:57
 */
package src;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintBinaryTreefromtoptobottomII {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        queue.add(root);
        int nextLevel = 0;
        int nowLevel = 1;
        while (!queue.isEmpty()) {
            TreeNode tem = queue.poll();
            list.add(tem.val);
            if (tem.left != null) {
                nextLevel++;
                queue.add(tem.left);
            }
            if (tem.right != null) {
                nextLevel++;
                queue.add(tem.right);
            }
            nowLevel--;
            if (nowLevel == 0) {
                lists.add(list);
                nowLevel = nextLevel;
                list = new LinkedList<>();
                nextLevel = 0;
            }
        }
        return lists;
    }
}
