/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev= null;
        Node curr = head ;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev ;
            
            prev = curr ;
            curr= next;
        }
        
        
        return prev ;
    }
}




// Recursive approach

/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head == null || head.next == null ){
            return head;
        }
        
        Node newHead = reverseList(head.next);
        head.next.next = head;
        
        head.next = null;
        
        
        return newHead ; 
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
    public ListNode reverseList(ListNode head) {
        // ? ? how to do 
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while(temp!= null){
            st.push(temp.val);
            temp= temp.next ;
        }

        temp = head;
        while(temp!= null){
            temp.val = st.peek();
            st.pop();
            temp = temp.next;
        }

        return head ;
        
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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head ;// this is for one node or no node 

        ListNode newNode = reverseList(head.next);

        ListNode front = head.next;

        front.next = head;

        // head.next.next = head;

        head.next = null ;

        return newNode ;

    }
}
