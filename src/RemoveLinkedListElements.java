/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveLinkedListElements {
    public void deleteNode(ListNode node) {
    	 if (null == head)
         {
    		 return head;
         }
     	 ListNode p = head;
         ListNode pre = null;
         while (null != p) 
         {
             if (p.val == val)
              {
                  //ListNode del = p;
                  p = p.next;
                  if (null != pre)
                  {
                      pre.next = p;
                  } 
                  else 
                  {
                      head = p;
                  }
  
              } else {
                  pre = p;
                  p = p.next;
              }
          }
  
          return head;
    }
}