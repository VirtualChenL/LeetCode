/**
 * FileName: IntersectionofTwoLinkedLists
 * Description: 相交链表
 * Author:   @VirtualChen
 * Date:     2018/12/10 0010 上午 10:42
 */

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        ListNode ka = headA;
        ListNode kb = headB;
        while (ka != null) {
            len1++;
            ka = ka.next;
        }
        while (kb != null) {
            len2++;
            kb = kb.next;
        }
        if (len1 >= len2) {
            ka = headA;
            kb = headB;
            int len = len1 - len2;
            int i = 0;
            for (i = 0; i < len; i++) {
                ka = ka.next;
            }
            for (; i < len1; i++) {
                if (ka.val == kb.val) {
                    return ka;
                }
                ka = ka.next;
                kb = kb.next;
            }
            return  null;
        }
        else{
            ka = headA;
            kb = headB;
            int len = len2 - len1;
            int i = 0;
            for (i = 0; i < len; i++) {
                kb = kb.next;
            }
            for (; i < len2; i++) {
                if (ka.val == kb.val) {
                    return kb;
                }
                ka = ka.next;
                kb = kb.next;
            }
            return  null;
        }
    }
}
