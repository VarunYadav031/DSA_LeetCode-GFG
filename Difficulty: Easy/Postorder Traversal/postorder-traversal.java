/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        helperpostorder(root,ans);
        return ans;
        
    }
    public static void helperpostorder(Node root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        helperpostorder(root.left,ans);
        
        helperpostorder(root.right,ans);
        ans.add(root.data);
        
    }
}