import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * FileName: KthSmallestElementinaBS
 * Description: 二叉搜索树中第K小的元素
 * Author:   @VirtualChen
 * Date:     2018/12/14 0014 上午 10:34
 */

public class KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode p=root;
        Stack<TreeNode> s=new Stack<>();
        List<Integer> list=new LinkedList<>();
        while (p!=null||!s.empty())
        {
            while (p!=null)
            {
                s.push(p);
                p=p.left;
            }
            while(!s.empty())
            {
               p=s.peek();
                list.add(p.val);
                s.pop();
                p=p.right;
            }
        }
        return  list.get(k-1);
    }
}
