/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        int carry = 0;
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        while (temp1 != null && temp2 != null) {
            int n1 = temp1.val;
            int n2 = temp2.val;

            int value = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;
            temp.val = value;

            temp1 = temp1.next;
            temp2 = temp2.next;

            ListNode newnode = new ListNode();
            if (temp1 != null && temp2 != null) {
                temp.next = newnode;
                temp = temp.next;
            }

        }

        ListNode nnewnode = new ListNode();
        if (temp1 != null || temp2 != null) {
            temp.next = nnewnode;
            temp = temp.next;
        }

        while (temp1 != null) {
            int n1 = temp1.val;
            int value = (n1 + carry) % 10;
            carry = (n1 + carry) / 10;
            temp.val = value;
            temp1 = temp1.next;
            ListNode newnode = new ListNode();
            if (temp1 != null) {
                temp.next = newnode;
                temp = temp.next;
            }
        }

        while (temp2 != null) {

            int n2 = temp2.val;

            int value = (n2 + carry) % 10;
            carry = (n2 + carry) / 10;
            temp.val = value;
            temp2 = temp2.next;
            ListNode newnode = new ListNode();
            if (temp2 != null) {
                temp.next = newnode;
                temp = temp.next;
            }
        }

        if (carry != 0) {
            nnewnode = new ListNode(carry);
            temp.next = nnewnode;
            temp = temp.next;
        }

        return newNode;
    }
}


//Using the Concept of Dummy Node 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        int carry = 0;

        ListNode t1 = l1;
        ListNode t2 = l2;

        while (t1 != null || t2 != null) {
            int sum = 0;
            if (t1 != null)
                sum += t1.val;
            if (t2 != null)
                sum += t2.val;

            ListNode newNode = new ListNode((sum + carry )% 10);
            carry = (sum + carry) / 10;

            temp.next = newNode;
            temp = temp.next;
            if (t1 != null)
                t1= t1.next;
            if (t2 != null)
                t2 = t2.next;
        }

        if(carry!= 0){
            ListNode newNode = new ListNode(carry);

            temp.next= newNode;
            temp = temp.next;
        }

        return dummy.next;

    }
}
