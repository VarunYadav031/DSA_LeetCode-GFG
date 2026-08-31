/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node curr=head;
        Node prev=null;
        HashSet<Integer>set=new HashSet<>();
        while(curr!=null){
            if(set.contains(curr.data)){
                prev.next=curr.next;
            }else{
                set.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
            
        }
        return head;
    }
}