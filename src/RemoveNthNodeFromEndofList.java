/**
 * 移除倒数第N个节点
 * @author Administrator
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		  ListNode p=head;
	      ListNode q=head;
	        for(int i=0;i<n;i++){
	            p=p.next;
	        }
	        if(p==null){
	            head=head.next;
	            return head;
	        }
	        while(p.next!=null){
	            p=p.next;
	            q=q.next;
	        }
	        q.next=q.next.next;
	        return head;
    }
}
