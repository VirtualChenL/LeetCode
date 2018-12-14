import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * FileName: BinaryTreeZigzagLevelOrderTraversal
 * Description: 二叉树的锯齿形层次遍历
 * Author:   @VirtualChen
 * Date:     2018/12/14 0014 上午 9:28
 */

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> listList = new LinkedList<>();
        if (root == null) {
            return listList;
        }
        boolean open = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new LinkedList<>();
            while (count != 0) {
                TreeNode tem = queue.poll();
                list.add(tem.val);
                if (tem.left != null) {
                    queue.offer(tem.left);
                }
                if (tem.right != null) {
                    queue.offer(tem.right);
                }
                count--;
            }
            if (open) {
                List<Integer> list2 = new LinkedList<>();
                for (int i = list.size() - 1; i >= 0; i--) {
                    list2.add(list.get(i));
                }
                open = false;
                listList.add(list2);
            } else {
                open = true;
                listList.add(list);
            }
        }
        return listList;
    }
}
