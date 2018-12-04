

/**
 * 对称二叉树
 * @author VirtualChen 
 *
 */
class Solution {
	/*
	 * 方法一 递归
	 */
	public boolean isSymmetric(TreeNode root){
        if (root==null)
            return true;
        return Symmetric(root.left, root.right);
    }
    public boolean Symmetric(TreeNode left, TreeNode right){
        if (left==null && right==null)
            return true;
        if (left==null || right==null)
            return false;
        if (left.val == right.val){
            return (Symmetric(left.left, right.right) && Symmetric(right.left, left.right));
        }
        return false;
    }
    
    /*
     * 方法2 BFS
     */
   
};