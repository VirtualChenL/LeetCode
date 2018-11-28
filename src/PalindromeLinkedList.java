import java.util.LinkedList;
import java.util.List;

/**
 * 回文链表
 * @author VirtualChen 
 *
 */
public class PalindromeLinkedList {
	/*
	 * 转化为数组比较
	 * 时间复杂度为O(n).空间复杂度为O(n)
	 */
	public boolean isPalindrome(ListNode head) {
		ListNode p=head;
		int len=0;
		while(p!=null)
		{
			len++;
			p=p.next;
		}
		int [] cs=new int[len];
		p=head;
		int j=0;
		while(p!=null)
		{
			cs[j++]=p.val;
			p=p.next;
		}
		for(int i=0;i<len/2;i++)
		{
			
			if(cs[i]!=cs[len-1-i])
			{
				return false;
			}
		}
		return true;
    }
	/*
	 * 用long int :sum来记录数字
	 * 
	 */
}
