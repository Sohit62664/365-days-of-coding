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
