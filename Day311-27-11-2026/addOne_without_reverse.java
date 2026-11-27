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
        
        Node first = null;
        Node temp = head;
        
        while(temp!= null){
            if(temp.data != 9){
                first = temp;
            }
            
            temp = temp.next;
        }
        
        if(first == null){
            Node head1 = new Node(1);
            head1.next=head;
            
            while(head!= null){
                head.data = 0 ;
                head = head.next ;
            }
            
            return head1;
        }else{
            first.data += 1;
            first = first.next ;
            
            while(first!= null){
                first.data = 0;
                first = first.next ;
            }
            
            return head;
        }
    }
}
