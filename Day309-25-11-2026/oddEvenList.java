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
