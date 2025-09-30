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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: dono null hain
        if (p == null && q == null) return true;
        
        // Agar sirf ek null hai
        if (p == null || q == null) return false;
        
        // Current node ka value check
        if (p.val != q.val) return false;
        
        // Recursively check left & right subtree
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
