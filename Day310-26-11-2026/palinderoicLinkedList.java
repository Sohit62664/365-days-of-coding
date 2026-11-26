/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head; 
        ListNode dummy  = new ListNode(-1);
        ListNode t = dummy;

        while(temp != null){
            ListNode n = new ListNode(temp.val);
            t.next = n ; 
            t = t.next;
        }
        

        ListNode pre = null ;
        ListNode curr = dummy.next;

        while(curr!= null){
            ListNode front = curr.next;
            curr.next = pre ; 
            pre = curr;
            curr = front;
        }


        ListNode head2 = pre;

        while(head!= null  && head2 != null){
            if(head.val!= head2.val) return false ;
            head= head.next ;
            head2 = head2.next;
        }

        return true;
    }
}
