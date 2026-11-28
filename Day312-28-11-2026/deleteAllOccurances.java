/* Structure of a linked list node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}
*/
class Solution {

  public Node deleteAllOccurances(Node head, int x) {
    // code here
    if (head == null)
      return null;

    if (head.next == null && head.data == x)
      return null;
      
      
     Node dummy = new Node(-1);
     dummy.next = head ;
     Node str = dummy;
     
     
     while(dummy!= null && dummy.next != null) {
        if(dummy.next.data == x){
            Node temp= dummy.next ;
            
            while(temp != null && temp.data ==  x){
                temp = temp.next;
            }
            
            dummy.next = temp;
        }
        
        dummy = dummy.next;
     }
     
     return str.next;
  }

}
