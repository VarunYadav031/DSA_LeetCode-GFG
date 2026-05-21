/* structure of list node:

class Node
{
    int data;
    Node next;
    Node(int val)
    {
        data=val;
        next=null;
    }
}

*/

class Solution {
    public Node findIntersection(Node head1, Node head2) {
        HashSet<Integer>set=new HashSet<>();
        
        
        while(head2!=null){
            set.add(head2.data);
            head2=head2.next;
            
        }
        Node dummy=new Node(0);
        Node tail=dummy;
        while(head1!=null){
            if(set.contains(head1.data)){
                tail.next=new Node(head1.data);
                tail=tail.next;
            }
            head1=head1.next;
        }
        return dummy.next;
    }
}