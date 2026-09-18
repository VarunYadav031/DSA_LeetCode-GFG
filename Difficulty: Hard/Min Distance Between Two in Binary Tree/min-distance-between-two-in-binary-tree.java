/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static Node lca(Node root,int a,int b){
        if(root==null){
            return null;
        }
        if(root.data==a || root.data==b){
            return root;
        }
        Node leftlca=lca(root.left,a,b);
        Node rightlca=lca(root.right,a,b);
        
        if(leftlca==null){
            return rightlca;
        }
         if(rightlca==null){
            return leftlca;
        }
        return root;
    }
    public int findDist(Node root, int a, int b) {
        Node LCA=lca(root,a,b);
        int distA = distance(LCA, a);
        int distB = distance(LCA, b);

        return distA + distB;
        
    }
    public static int distance(Node root,int target){
        if(root==null){
            return -1;
        }
        if(root.data==target){
            return 0;
        }
        int leftdis=distance(root.left,target);
        if(leftdis!=-1){
            return leftdis+1;
        }
        int rightdis=distance(root.right,target);
        if(rightdis!=-1){
            return rightdis+1;
        }
        return -1;
    }
}