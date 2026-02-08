package Day23;

import org.w3c.dom.Node;

public class insert_At_First_In_LinkedList {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    class Solution {
        public Node insertAtFront(Node head, int x) {
            // code here
            Node node = new Node(x);
            node.next = head;
            // head = node;
            return node;
        }
    }
}
