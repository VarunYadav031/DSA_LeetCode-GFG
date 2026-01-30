/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        if(head==null)return -1;
        Node curr=head;
        int count=0;
        while(curr!=null){
            count +=1;
            curr=curr.next;
        }
        if(k>count)return -1;
        curr=head;
        for(int i=0;i<count-k;i++){
            curr=curr.next;
        }
        return curr.data;
    }
}