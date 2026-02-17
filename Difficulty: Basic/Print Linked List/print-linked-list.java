/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/
class Solution {
    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer>ans=new ArrayList<>();
       Node curr=head;
       while(curr!=null){
        //System.out.println(curr.data);
           ans.add(curr.data);
           curr=curr.next;
       }
        return ans;
    }
}