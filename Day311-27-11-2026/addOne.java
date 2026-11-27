/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
  public Node addOne(Node head) {
    // code here.
    Node temp = reverse(head);

    Node h2 = temp;
    int carry = 0;
    Node pre = null;
    while(temp != null && temp.data == 9) {
        pre = temp;
      temp.data = 0;
      temp= temp.next;
      carry = 1;
    } 
    
    if(temp != null){
      temp.data += 1;
    }else{
        pre.next = new Node(1);
    }
    return reverse(h2);
  }

  Node reverse(Node temp) {
    Node pre = null;

    while (temp != null) {
      Node front = temp.next;
      temp.next = pre;
      pre = temp;
      temp = front;
    }

    return pre;
  }
}
