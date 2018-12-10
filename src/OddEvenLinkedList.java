/**
 * FileName: OddEvenLinkedList
 * Description: 奇偶链表
 * Author:   @VirtualChen
 * Date:     2018/12/10 0010 上午 10:21
 */

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode answer = head;
        if(head==null||head.next==null||head.next.next==null)
        {
            return head;
        }
        ListNode Even = head.next;
        ListNode amswer2 = Even;
        while (head.next != null && Even.next != null) {
            head.next = Even.next;
            head = head.next;
            Even.next = head.next;
            Even = Even.next;
        }
        head.next = amswer2;
        return answer;
    }
}
