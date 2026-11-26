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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null ) return head ;

        // ListNode temp = null ;
        f(head);
        temp.next = null ;
        ListNode result = ans.next ;
        ans.next = null;
        ans = new ListNode(-1);
        temp  = ans ;
        return result;
    }
    static ListNode ans = new ListNode(-1) ;
    static ListNode temp = ans ;

    void f(ListNode head ){
        if(head == null){
            return ;
        }
        ListNode pre = head;
        f(head.next);
        temp.next = pre ;
        temp = temp.next;
    }
}
