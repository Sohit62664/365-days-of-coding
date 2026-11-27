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
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        int N1 = 0;
        int N2 = 0;
        while (temp1 != null) {
            N1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            temp2 = temp2.next;
            N2++;
        }

        if (N1 == N2) {
            ListNode ans = compare(headA, headB);

            return ans;
        } else if (N1 > N2) {
            int steps = N1 - N2;
            ListNode start = headA;

            for (int i = 0; i < steps; i++) {
                start = start.next;
            }

            ListNode ans = compare(start, headB);

            return ans;

        }else{
            int steps = N2 - N1;
            ListNode start = headB;

            for (int i = 0; i < steps; i++) {
                start = start.next;
            }

            ListNode ans = compare(start, headA);

            return ans;
        }
    }

    ListNode compare(ListNode temp1 , ListNode temp2){
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2 ) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next ;

        }

        return null;
    }
}
