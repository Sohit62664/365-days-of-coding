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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        if(head == null) return head;
        ListNode t1 = head;
        ListNode t2 = head.next;

        while( t1 != null ){

            ListNode newNode = new ListNode(t1.val) ;
            temp.next = newNode ;

            temp= temp.next;
            
            if(t1.next!= null){
                t1 = t1.next.next;
            }else if(t1.next==null){
                t1= t1.next;
            }
            
        }


        while( t2 != null ){

            ListNode newNode = new ListNode(t2.val) ;
            temp.next = newNode ;

            temp= temp.next;
            
            if(t2.next!= null){
                t2 = t2.next.next;
            }else if(t2.next==null){
                t2= t2.next;
            }
            
        }




        return dummy.next;
    }
}



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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode estart = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next ;
            odd = odd.next ;
            even = even.next; 
        }

        // if(odd.next.next!= null) odd = odd.next.next ;
        // if(even.next!= null) odd =  odd.next.next ;
        odd.next = estart;

        return head ;
    }
}
