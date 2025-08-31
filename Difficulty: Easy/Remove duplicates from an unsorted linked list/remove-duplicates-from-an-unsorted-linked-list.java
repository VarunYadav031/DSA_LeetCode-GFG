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
        // Your code here
        if(head==null || head.next==null) return head ;
        HashSet<Integer>set=new HashSet<>();
       Node prev=head;
       Node curr=head.next;
       set.add(prev.data);
      while(curr!=null){
          if(!set.contains(curr.data)){
              set.add(curr.data);
              prev.next=curr;
              prev=curr;
             
              
          }
              curr=curr.next;
          
      }
        prev.next=null;
        return head;
    }
}