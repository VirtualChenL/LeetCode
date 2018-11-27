/**
 * 反转链表
 * @author Administrator
 *
 */
public class ReverseLinkedList {
	/*
	 * 原地反转法
	 */
	public ListNode reverseList(ListNode head) {
		if(head==null)
		{
			return head;
		}
        ListNode first=new ListNode(-1);
        first.next=head;
        ListNode p=first.next;
        ListNode q=first.next.next;
        while(q!=null)
        {
            p.next=q.next;
            q.next=first.next;
            first.next=q;
            q=p.next;
        }
        return first.next;

	}
	/*
	 * 新建链表，头结点插入法
	 */

	public ListNode reverseList2(ListNode head) {
		ListNode newlist=new ListNode(-1);
		ListNode p=head;
		while(p!=null)
		{
			ListNode q=p.next;
			p.next=newlist.next;
			newlist.next=p;
			p=q;
			
		}
		return newlist.next;
}

}


































