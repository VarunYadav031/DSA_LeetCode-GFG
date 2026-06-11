/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        inOrderhelper(root,ans);
        return ans;
       
        
    }
    public void inOrderhelper(Node root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        inOrderhelper(root.left,ans);
        ans.add(root.data);
        inOrderhelper(root.right,ans);
        
        
    }
}