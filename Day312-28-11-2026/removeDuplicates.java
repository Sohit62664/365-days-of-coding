/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
  Node removeDuplicates(Node head) {

    if (head == null || head.next == null)
      return head;
    // code here
    Node curr = head;

    while (curr != null) {
      Node nextnode = curr.next;

      while (nextnode != null && nextnode.data == curr.data) {
        nextnode = nextnode.next;
      }
      
      curr.next= nextnode;
      if(nextnode != null){
          nextnode.prev = curr;
      }
      
      curr = curr.next;
    }

    return head;
  }
}
