/**
 * 合并两个有序链表
 * @author VirtualChen 
 *
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p=l1;
        ListNode q=l2;
        ListNode k=null;
        ListNode newlist=new ListNode(-1);
        ListNode late=newlist;
        if(l1==null&&l2==null)
        {
        	return null;
        }
        else if(l1==null&&l2!=null)
        {
        	return l2;
        }
        else if(l1!=null&&l2==null)
        {
        	return l1;
        }
        else {
        while(p!=null&&q!=null)
        {
        	if(p.val<q.val)
        	{
        		k=p.next;
        		p.next=null;
        		late.next=p;
        		late=p;
        		p=k;
        	}
        	else 
        	{
        		k=q.next;
        		q.next=null;
        		late.next=q;
        		late=q;
        		q=k;
        	}
        	
        }
        if(p==null&&q!=null)
        {
        	while(q!=null)
        	{
        		late.next=q;
        		late=q;
        		q=q.next;
        	}
        }
        if(p!=null&&q==null)
        {
        	while(p!=null)
        	{
        		late.next=q;
        		late=q;
        		q=q.next;
        	}
        }
        return newlist.next;
        }
    }
}
