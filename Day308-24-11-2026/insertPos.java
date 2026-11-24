/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        this.data = x;
        this.next = null;
    }
} */
class Solution {
  public Node insertPos(Node head, int pos, int val) {
    // code here

    Node newNode = new Node(val);

    int ite = pos - 2;
    Node temp = head;

    if (pos == 1) {

      newNode.next = head;
      head = newNode ;
      return head;
    }
    
    for(int i = 0 ; i< ite ; i++){
        temp = temp.next ;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
  }
}
