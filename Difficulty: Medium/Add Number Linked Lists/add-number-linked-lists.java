class Solution {

    public static Node reverse(Node head) {

        Node curr = head;
        Node prev = null;

        while(curr != null) {

            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }

    public Node addTwoLists(Node head1, Node head2) {

        head1 = reverse(head1);
        head2 = reverse(head2);

        int carry = 0;

        Node dummy = new Node(0);
        Node tail = dummy;

        while(head1 != null || head2 != null || carry != 0) {

            int sum = carry;

            if(head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if(head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;

            tail.next = new Node(digit);
            tail = tail.next;
        }

        Node ans = reverse(dummy.next);

        // Remove leading zeros
        while(ans != null && ans.data == 0 && ans.next != null) {
            ans = ans.next;
        }

        return ans;
    }
}