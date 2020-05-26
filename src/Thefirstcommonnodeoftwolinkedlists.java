/**
 * FileName: Thefirstcommonnodeoftwolinkedlists
 * Description: 两个链表的第一个公共节点
 * 输入两个链表，找出它们的第一个公共节点
 * Author:   @VirtualChen
 * Date:     2020/4/27 16:23
 */
package src;

import java.util.LinkedList;

public class Thefirstcommonnodeoftwolinkedlists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headB==null||headA==null) return null;
        ListNode cur1=headA,cur2=headB;
        int n=0;
        while(cur1!=null){
            n++;
            cur1=cur1.next;
        }

        while(cur2!=null){
            n--;
            cur2=cur2.next;
        }
        cur1=n>0?headA:headB;
        cur2=cur1==headA?headB:headA;
        n=Math.abs(n);
        while(n>0){
            cur1=cur1.next;
            n--;
        }

        while(cur1!=cur2){
            cur2=cur2.next;
            cur1=cur1.next;
        }
        return cur1;
    }
}
