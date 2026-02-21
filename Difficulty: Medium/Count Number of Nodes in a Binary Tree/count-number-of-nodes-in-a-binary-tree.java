// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        if(root==null) return 0;
        int lc=countNodes(root.left);
        int rc=countNodes(root.right);
         int treecount=lc+rc+1;
        return treecount;
        
    }
}