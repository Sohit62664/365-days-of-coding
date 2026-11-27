/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;

        boolean flag1 = true;
        boolean flag2 = true;
        while (!(dummy1 == null && dummy2 == null)) {
            if (dummy1 != null && dummy2 != null && dummy1 == dummy2) {
                ListNode ans = dummy1;
                boolean move = true;
                while (dummy1 != null && dummy2 != null && dummy1 == dummy2) {
                    move = false;
                    dummy1 = dummy1.next;
                    dummy2 = dummy2.next;
                }

                if (dummy1 == null && dummy2 == null)
                    return ans;

                if (move) {
                    dummy1 = dummy1.next;
                    dummy2 = dummy2.next;
                }

            } else {
                dummy1 = dummy1.next;
                dummy2 = dummy2.next;
            }

            if (dummy1 == null && flag1) {
                dummy1 = headB;
                flag1 = false;
            }
            if (dummy2 == null && flag2) {
                dummy2 = headA;
                flag2 = false;
            }
        }

        return null;
    }
}
