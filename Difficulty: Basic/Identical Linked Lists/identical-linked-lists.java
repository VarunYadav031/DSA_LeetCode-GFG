class Solution {
    public boolean areIdentical(Node head1, Node head2) {

        // base cases
        if (head1 == null && head2 == null) return true;
        if (head1 == null || head2 == null) return false;

        Node curr1 = head1;
        Node curr2 = head2;

        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        // length same hona chahiye
        return curr1 == null && curr2 == null;
    }
}
