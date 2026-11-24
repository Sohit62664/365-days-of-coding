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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0 ;
        ListNode temp = head ;

        while(temp!= null){
            temp = temp.next ;
            sz++;
        }
        
        if(sz == 1 && head.next== null){
            return null;
        }
        
        temp = head ;

        int pos = sz - n;

        if(pos == 0){
            head= head.next; 
            return head;
        }

        

        // if(pos < 0) return head;
        for(int i = 1 ; i< pos ; i++){
            temp = temp.next;
        } 

        temp.next = temp.next.next;

        return head;
        
    }
}
