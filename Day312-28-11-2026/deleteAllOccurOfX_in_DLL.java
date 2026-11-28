/*Structure of the doubly linked list  Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/

class Solution {
  public Node deleteAllOccurOfX(Node head, int x) {
    // code here
    Node pre = null;

    Node curr = head;

    while (curr != null) {
      if (curr.data == x) {
        // need to delete the curr
        Node front = curr.next;

        if (pre != null) {
          pre.next = front;
        }

        if (front != null) {
          front.prev = pre;
        }

        if (head == curr) {
          head = front;
        }

        curr = front;
      } else {
        pre = curr;
        curr = curr.next;
      }
    }
    return head;
  }
}
