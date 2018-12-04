import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层次遍历
 * @author VirtualChen 
 *
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
    //	List<Integer> list=new LinkedList<>();
    	List<List<Integer>> list2=new LinkedList<>();
    	if(root==null)
    	{
    		return list2;
    	}
    	Queue<TreeNode> queue=new LinkedList<>();
    	queue.offer(root);
    	
    	while(!queue.isEmpty())
    	{
    		int count=queue.size();
    		List<Integer> list=new LinkedList<>();
    		while((count--)!=0)
    		{
    			TreeNode node=queue.peek();
    			queue.poll();
    			list.add(node.val);
    			
    			if(node.left!=null)
    			{
    				queue.offer(node.left);
    			}
    			if(node.right!=null)
    			{
    				queue.offer(node.right);
    			}
    		}
    		list2.add(list);
    	}
    	return list2;
    }
}
