/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int sumBT(Node root) {
       if(root==null){
           return 0;
       }
       int ls=sumBT(root.left);
       int rs=sumBT(root.right);
       int sum=ls+rs+root.data;
       return sum;
        
    }
}