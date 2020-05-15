/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        int index = 0;
        ListNode res = head;
        while (head != null) {
            if(! map.containsKey(head)) {
                map.put(head, index);
                index ++;
            } else {
                res = head;
                break;
            }
            head = head.next;
        }
        return head == null ? null : res;
    }
}