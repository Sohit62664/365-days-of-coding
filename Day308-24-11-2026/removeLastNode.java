/* Linked List Node Structure
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        Node temp = head;
        
        if(head== null || head.next == null) return null;
        while(temp.next.next!= null) {
            temp = temp.next;
        }
        
        temp.next = null;
        return head;
    }
}
