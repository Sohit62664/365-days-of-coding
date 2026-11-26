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



// Self logic 
// Reverse the half of the ll and then match them  if mismatch then return false ; otherwise return true;


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
        ListNode fast = head ; 
        ListNode slow = head ; 

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; 
        }
        ListNode pre = null;
        ListNode curr = slow ; 

        if(fast!= null){
            curr = slow.next;
        }

        

        while(curr!= null){
            ListNode front = curr.next;
            curr.next = pre ;
            pre = curr ; 
            curr = front;
        }


        while(pre!= null){
            if(pre.val != head.val) return false ;

            pre = pre.next ;
            head = head.next;
        }

        return true ;


    }
}
