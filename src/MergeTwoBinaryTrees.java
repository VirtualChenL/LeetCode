/**
 * FileName: MergeTwoBinaryTrees
 * Description: 合并二叉树
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 下午 8:32
 */

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        } else {
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
        }
        return t1;
    }
}
