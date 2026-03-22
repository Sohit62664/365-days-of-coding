// User function Template for Java

/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    */
    
class Solution {
    public static Node insertionSort(Node head) {
        
        if (head == null) return head;
        
        Node sorted = null;
        
        Node current = head;
        
        while (current != null) {
            Node next = current.next;  
            sorted = insert(sorted, current); 
            
            current = next; 
        }
        
        return sorted;
    }
    
    private static Node insert(Node head, Node node) {
        
        // insert at beginning
        if (head == null || node.data <= head.data) {
            node.next = head;
            return node;
        }
        
        Node temp = head;
        
        while (temp.next != null && temp.next.data < node.data) {
            temp = temp.next;
        }
        
        node.next = temp.next;
        temp.next = node;
        
        return head;
    }
}
