class Solution {

    int max = 0;

    public int diameter(Node root) {
        height(root);
        return max;
    }

    public int height(Node root){
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        max = Math.max(max, lh + rh);   // 👈 removed +1

        return 1 + Math.max(lh, rh);
    }
}