/**
 * FileName: MergeTwoBinaryTrees
 * Description: 合并二叉树
 * Author:   @VirtualChen
 * Date:     2018/12/18 0018 下午 8:32
 */

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        TreeNode ansTree=new TreeNode(t1.val+t2.val);
        ansTree.left=merge(t1.left,t2.left);
        ansTree.right=merge(t1.right,t2.right);
      return ansTree;
    }
    public void merge(TreeNode ans,TreeNode a,TreeNode b) {
        if (a == null && b == null) {
            return ;
        } else if (a == null) {
            ans= new TreeNode(b.val);
        } else {
            ans= new TreeNode(a.val);
        }
        merge();
    }
}
