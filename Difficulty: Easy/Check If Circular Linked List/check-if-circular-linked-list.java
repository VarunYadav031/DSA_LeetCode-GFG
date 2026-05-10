/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        Node curr=head;
        Node prev=head;
        while(curr!=null){
            
            if(curr.next==prev){
                return true;
            }else{
                curr=curr.next;
            }
        }
        return false;
        
    }
}