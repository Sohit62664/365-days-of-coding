/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
  public int getKthFromLast(Node head, int k) {
    // code here
    int sz = 0;
    Node temp = head;

    while (temp != null) {
      temp = temp.next;
      sz++;
    }
    
    if(k > sz) return -1 ;

    temp = head;

    int pos = sz - k;

    // if(pos < 0) return head;
    for (int i = 1; i <= pos; i++) {
      temp = temp.next;
    }
    
    return temp.data;
  }
}
