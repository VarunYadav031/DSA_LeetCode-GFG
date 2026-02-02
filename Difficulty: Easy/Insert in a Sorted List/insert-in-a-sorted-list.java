class Solution {
    Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);

        // Case 1: empty list OR insert before head
        if (head == null || key <= head.data) {
            newNode.next = head;
            return newNode;
        }

        // Case 2: find position to insert
        Node curr = head;
        while (curr.next != null && curr.next.data < key) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }
}
