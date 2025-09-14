class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Step 1: check if there are at least k nodes
        ListNode temp = head;
        int cnt = 0;
        while (cnt < k && temp != null) {
            temp = temp.next;
            cnt++;
        }
        // if less than k nodes, return head (no reversal)
        if (cnt < k) return head;
        // Step 2: reverse k nodes
        ListNode prev = reverseKGroup(temp, k); // recursive call for next groups
        ListNode curr = head;
        cnt = 0;
        while (cnt < k) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            cnt++;
        }
        return prev;
    }
}
