import java.util.*;

/**
 * FileName: BinaryTreeLevelOrderTraversalII
 * Description: 二叉树的层次遍历 II
 * Author:   @VirtualChen
 * Date:     2019/2/21 0021 下午 1:46
 */

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null)
            return new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            ArrayList<Integer> subList = new ArrayList<Integer>();
            while (count > 0) {
                TreeNode node = queue.poll();
                subList.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                count--;
            }
            res.add(subList);
        }
        Collections.reverse(res);
        return res;

    }
}
