/**
 * FileName: BinaryTreeMaximumPathSum
 * Description: 二叉树中的最大路径和
 * 给定一个非空二叉树，返回其最大路径和。
 * 本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点
 * Author:   @VirtualChen
 * Date:     2020/5/25 20:21
 */
package src;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class BinaryTreeMaximumPathSum {
//    public int maxPathSum(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//         return maxSum(root.val, maxPathSum(root.right), maxPathSum(root.left));
//    }
//
//    private int maxSum(int val, int right, int left) {
//        List<Integer> list = new LinkedList<Integer>() {{
//            add(val);
//            add(val + left);
//            add(val + right);
//            add(val + right + left);
//            add(right);
//            add(left);
//        }};
//        Collections.sort(list);
//        return list.get(5);
//    }


    int max_sum = Integer.MIN_VALUE;

    public int max_gain(TreeNode node) {
        if (node == null) return 0;

        // max sum on the left and right sub-trees of node
        int left_gain = Math.max(max_gain(node.left), 0);
        int right_gain = Math.max(max_gain(node.right), 0);

        // the price to start a new path where `node` is a highest node
        int price_newpath = node.val + left_gain + right_gain;

        // update max_sum if it's better to start a new path
        max_sum = Math.max(max_sum, price_newpath);

        // for recursion :
        // return the max gain if continue the same path
        return node.val + Math.max(left_gain, right_gain);
    }

    public int maxPathSum(TreeNode root) {
        max_gain(root);
        return max_sum;
    }
}
