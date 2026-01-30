/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        HashSet<Integer> ans=new HashSet<>();
       Node prev=head;
       Node curr=head.next;
       ans.add(prev.data);
       while(curr!=null){
           if(!ans.contains(curr.data)){
               ans.add(curr.data);
               prev.next=curr;
               prev=curr;
           }
               curr=curr.next;
       }
       prev.next=null;
       return head;
        
    }
}