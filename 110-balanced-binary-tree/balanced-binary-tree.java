/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        int dummyheight=height(root);
        if(dummyheight==-1) return false;
        return true;

        
    }
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsubtreeheight=height(root.left);
        int rightsubtreeheight=height(root.right);
        if(leftsubtreeheight==-1 || rightsubtreeheight==-1){
            return -1;
        }
        if(Math.abs(leftsubtreeheight-rightsubtreeheight)>1){
            return -1;
        }
        return 1+Math.max(leftsubtreeheight,rightsubtreeheight);
    }
}