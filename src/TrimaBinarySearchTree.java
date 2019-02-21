import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * FileName: TrimaBinarySearchTree
 * Description: 修剪二叉搜索树
 * Author:   @VirtualChen
 * Date:     2019/2/21 0021 下午 1:57
 */

public class TrimaBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) {
            return null;
        }
        if(root.val < L) {
            return trimBST(root.right, L, R);
        }
        if(root.val > R) {
            return trimBST(root.left, L, R);
        }
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
