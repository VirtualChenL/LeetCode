/**
 * FileName: RemoveDuplicatesfromSortedList
 * Description: 删除排序链表中的所有重复元素
 * Author:   @VirtualChen
 * Date:     2018/12/24 0024 下午 3:10
 */

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if (p == null) {
            return null;
        }
        while (p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
