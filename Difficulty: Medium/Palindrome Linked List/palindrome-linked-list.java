/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        ArrayList<Integer> ans=new ArrayList<>();
        Node curr=head;
        while(curr!=null){
            ans.add(curr.data);
            curr=curr.next;
        }
        int i=0;
        int j=ans.size()-1;
        while(i<j){
            if(!ans.get(i).equals(ans.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}