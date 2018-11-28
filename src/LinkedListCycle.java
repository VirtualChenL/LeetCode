/**
 * 环形链表
 * 通过设置两个指针，其中一个指针每次移动一次，另一个每次移动两次，如果纯在环，则两个指针肯定会存在相等的时候。
 * @author VirtualChen 
 *
 */
public class LinkedListCycle {
	 public boolean hasCycle(ListNode head) {
		 ListNode p=head;
		 ListNode q=head;
		 if(head==null||head.next==null)
		 {
			 return false;
		 }
		 else
		 {
			 do 
			 {
				p=p.next;
				q=q.next.next;
			 } while (q!=null&&q!=p&&q.next!=null);
		 }
		 if(q==p)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
}
