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
        ListNode l1 = headA;
        ListNode l2 = headB;
        while (l1 != null) {
            while (l2 != null) {
                if (l2 == l1) {
                    return l2;
                } else {
                    l2 = l2.next;
                }
            }
            l1 = l1.next;
            l2 = headB;
        }
        return null;
    }
}