/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
  public int lengthOfLoop(Node head) {
    // code here
    Node st = finder(head);
    Node temp = st;
    
    int i =0 ;
    while(st!= null){
        
        temp = temp.next;
        i++;
        
        if(st== temp){
            return i;
        }
    }
    
    return 0 ; 
  }

  Node finder(Node head) {
    HashMap<Node, Integer> map = new HashMap<>();
    Node temp = head;
    while (temp != null) {
      if (map.containsKey(temp)) {
        return temp;
      }

      map.put(temp, 1);
      temp = temp.next;
    }
    
    return null;
  }
}
