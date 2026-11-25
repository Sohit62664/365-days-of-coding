/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/

// in terms of data 
class Solution {
    public Node reverse(Node head) {
        // code here
        Stack<Node> st = new Stack<>();
        
        Node temp = head ;
        
        while(temp!= null){
            st.push(temp) ;
            temp= temp.next;
        }
        
        
        temp = head;
        // head.prev= null;
        Node temp2 = head.prev; 
        while(!st.isEmpty() ){
            Node node = st.pop();
            temp.data= node.data;
            temp=temp.next;
        }
        
        
        return head;
    }
}
