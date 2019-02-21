import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * FileName: NaryTreeLevelOrderTraversal
 * Description: N叉树的层序遍历
 * Author:   @VirtualChen
 * Date:     2019/2/21 0021 下午 12:36
 */

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        if(root == null)
            return new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            ArrayList<Integer> subList = new ArrayList<Integer>();
            while(count > 0){
                Node node = queue.poll();
                subList.add(node.val);
                for(Node child : node.children){
                    queue.add(child);
                }
                count--;
            }
            res.add(subList);
        }
        return res;
    }
}
