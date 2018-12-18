import java.util.LinkedList;
import java.util.Queue;

/**
 * FileName: PopulatingNextRightPointersinEachNode
 * Description: 每个节点的右向指针
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 上午 9:54
 */

public class PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        TreeLinkNode kroot = root;
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.offer(kroot);
        int i = 0;
        int k = 1;
        while (!queue.isEmpty()) {
            i++;
            TreeLinkNode tem = queue.poll();
            if (tem.left != null) {
                queue.offer(tem.left);
            }
            if (tem.right != null) {
                queue.offer(tem.right);
            }
            if (i == k) {
                i = 0;
                k = k * 2;
                tem.next = null;
            } else {
                tem.next = queue.peek();
            }
        }

    }
}
