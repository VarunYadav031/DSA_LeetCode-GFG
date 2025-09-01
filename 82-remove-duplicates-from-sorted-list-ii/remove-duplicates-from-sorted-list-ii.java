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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0, head); // sentinel before head
        ListNode prev = dummy;                  // last node before the current group
        ListNode curr = head;                   // iterator through the list

        while (curr != null) {
            // Move curr to the end of this value's group
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }
            // If prev.next == curr, no duplicates in this group → keep it
            if (prev.next == curr) {
                prev = prev.next;
            } else {
                // Duplicates existed → skip the whole group
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
