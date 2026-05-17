/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        Node curr=head;
        int count=0;
        while(curr!=null){
            count +=1;
            curr=curr.next;
        }
        return count;
        
    }
}