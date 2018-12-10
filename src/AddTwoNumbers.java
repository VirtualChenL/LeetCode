/**
 * FileName: AddTwoNumbers
 * Description: 两数相加
 * Author:   @VirtualChen
 * Date:     2018/12/10 0010 上午 9:32
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = 1;
        int len2 = 1;
        ListNode answer = new ListNode(0);
        ListNode a = answer;
        for (ListNode listNode = l1; listNode != null; listNode = listNode.next) {
            len1++;
        }
        for (ListNode listNode = l2; listNode != null; listNode = listNode.next) {
            len2++;
        }
        if (len1 == 1 && l1.val == 0) {
            return l2;
        } else if (len2 == 1 && l2.val == 0) {
            return l1;
        }
        ListNode tem1 = l1;
        ListNode tem2 = l2;
        int k = 0;
        if (len1 <= len2) {
            while (tem1 != null) {
                if (tem2.val + tem1.val + k >= 10) {
                    ListNode temp = new ListNode(tem2.val + tem1.val - 10 + k);
                    answer.next = temp;
                    k = 1;
                } else {
                    ListNode temp = new ListNode(tem2.val + tem1.val + k);
                    answer.next = temp;
                    k = 0;
                }
                tem1 = tem1.next;
                tem2 = tem2.next;
                answer = answer.next;
            }
            while (tem2 != null) {
                if (tem2.val + k >= 10) {
                    ListNode temp = new ListNode(tem2.val - 10 + k);
                    answer.next = temp;
                    k = 1;
                } else {
                    ListNode temp = new ListNode(tem2.val + k);
                    answer.next = temp;
                    k = 0;

                }
                tem2 = tem2.next;
                answer = answer.next;
            }
            if (k == 1) {
                ListNode newlistnode = new ListNode(1);
                answer.next = newlistnode;
            }
            return a.next;
        } else {
            while (tem2 != null) {
                if (tem2.val + tem1.val + k >= 10) {
                    ListNode temp = new ListNode(tem2.val + tem1.val - 10 + k);
                    answer.next = temp;
                    k = 1;
                } else {
                    ListNode temp = new ListNode(tem2.val + tem1.val + k);
                    answer.next = temp;
                    k = 0;
                }
                tem1 = tem1.next;
                tem2 = tem2.next;
                answer = answer.next;
            }
            while (tem1 != null) {
                if (tem1.val + k >= 10) {
                    ListNode temp = new ListNode(tem1.val - 10 + k);
                    answer.next = temp;
                    k = 1;
                } else {
                    ListNode temp = new ListNode(tem2.val + k);
                    answer.next = temp;
                    k = 0;

                }
                tem1 = tem1.next;
                answer = answer.next;
            }
            if (k == 1) {
                ListNode newlistnode2 = new ListNode(1);
                answer.next = newlistnode2;
            }
            return a.next;
        }
    }
}
