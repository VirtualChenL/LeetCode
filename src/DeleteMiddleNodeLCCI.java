/**
 * FileName: DeleteMiddleNodeLCCI
 * Description: 实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点
 * Author:   @VirtualChen
 * Date:     2020/2/20 21:31
 */
package src;

public class DeleteMiddleNodeLCCI {
    public void deleteNode(ListNode node) {
         node.val=node.next.val;
         node.next=node.next.next;
    }
}
