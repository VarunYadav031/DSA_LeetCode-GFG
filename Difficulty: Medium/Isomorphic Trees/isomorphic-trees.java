/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    boolean isIsomorphic(Node a, Node b) {
        if(a==null && b==null) return true;
        if(a==null || b==null || a.data!=b.data)return false;
        return isIsomorphic(a.left,b.right)&& isIsomorphic(a.right,b.left)
        || isIsomorphic(a.left,b.left) && isIsomorphic(a.right,b.right);
        
    }
}