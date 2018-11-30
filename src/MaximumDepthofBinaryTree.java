/**
 * 二叉树的最大深度
 * @author VirtualChen 
 *
 */
public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
        return root==null? 0:(1+Math.max(maxDepth(root.right), maxDepth(root.left)));
    }
}
