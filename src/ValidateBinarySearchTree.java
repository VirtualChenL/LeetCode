import java.util.ArrayList;
import java.util.List;

/**
 * 验证二叉搜索树
 * 利用中序遍历
 * @author VirtualChen 
 *
 */
public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
        order(root, list);
        for (int i = 0; i < list.size() - 1; ++i) {
            if (list.get(i) >= list.get(i + 1)) return false;
        }
        return true;
    }
    public void order(TreeNode node, List<Integer> list) {
        if (node == null) return;
        order(node.left, list);
        list.add(node.val);
        order(node.right, list);	
        }
}
