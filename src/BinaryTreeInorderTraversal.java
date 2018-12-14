import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * FileName: BinaryTreeInorderTraversal
 * Description: 二叉树的中序遍历
 * Author:   @VirtualChen
 * Date:     2018/12/14 0014 上午 9:00
 */

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        TreeNode p=root;
        Stack<TreeNode> s=new Stack<>();
        while(p!=null||!s.empty()){
            while(p!=null)
            {
                s.push(p);
                p=p.left;
            }
            if(!s.empty()){
                p=s.peek();
                list.add(p.val);
                s.pop();
                p=p.right;
            }
        }
        return list;
    }
}
