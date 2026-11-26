/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
  public Node segregate(Node head) {
    // code here

    if (head == null || head.next == null)
      return head;
    Node temp = head;

    Node dummy0 = new Node(-1);
    Node dummy1 = new Node(-1);
    Node dummy2 = new Node(-1);

    Node t0 = dummy0;
    Node t1 = dummy1;
    Node t2 = dummy2;

    while (temp != null) {

      // Since the Orignal links are Still There So We need to Detech them As
      // well
      Node next = temp.next;
      temp.next = null;
      if (temp.data == 0) {
        t0.next = temp;
        t0 = t0.next;
      } else if (temp.data == 1) {
        t1.next = temp;
        t1 = t1.next;
      } else if (temp.data == 2) {
        t2.next = temp;
        t2 = t2.next;
      }

      temp = next;
    }

    if (dummy1.next != null) {
      t0.next = dummy1.next;
    } else {
      t0.next = dummy2.next;
    }

    t1.next = dummy2.next;

    if (dummy0.next != null)
      return dummy0.next;
    if (dummy1.next != null)
      return dummy1.next;

    return dummy2.next;
  }
}
