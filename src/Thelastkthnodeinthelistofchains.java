/**
 * FileName: Thelastkthnodeinthelistofchains
 * Description: 输入一个链表，输出该链表中倒数第k个节点。
 * Author:   @VirtualChen
 * Date:     2020/2/21 21:35
 */
package src;

public class Thelastkthnodeinthelistofchains {
    public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode node1=head;
            ListNode node2=head;
            for(int i=1;i<k;i++){
                node1=node1.next;
            }
            while (node1.next!=null){
                node1=node1.next;
                node2=node2.next;
            }
            return node2;
    }
}
