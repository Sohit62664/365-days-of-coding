package Day23;

public class insert_At_Specific_index {

    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    class Solution {
        public Node insertPos(Node head, int pos, int val) {
            // code here
            // pos = position (1-based)

            if (pos < 1)
                return head;

            Node node = new Node(val);
            if (pos == 1) {
                node.next = head;
                return node;
            }
            Node temp = head;
            int i = 1;

            while (i < pos - 1 && temp.next != null) {
                temp = temp.next;
                i++;
            }
            if (temp == null)
                return head;
            node.next = temp.next;
            temp.next = node;
            return head;
        }
    }
}
