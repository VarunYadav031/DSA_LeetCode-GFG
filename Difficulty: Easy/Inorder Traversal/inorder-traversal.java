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
        helperInorder(root,ans);
        return ans;
        
    }
    public static void helperInorder(Node root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        helperInorder(root.left,ans);
        ans.add(root.data);
        helperInorder(root.right,ans);
    }
}