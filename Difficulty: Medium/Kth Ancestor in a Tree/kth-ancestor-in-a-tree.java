class Solution {

    int ans = -1;

    int solve(Node root, int k, int node) {

        if (root == null) {
            return -1;
        }

        if (root.data == node) {
            return 0;
        }

        int left = solve(root.left, k, node);

        if (left != -1) {

            if (left + 1 == k) {
                ans = root.data;
            }

            return left + 1;
        }

        int right = solve(root.right, k, node);

        if (right != -1) {

            if (right + 1 == k) {
                ans = root.data;
            }

            return right + 1;
        }

        return -1;
    }

    public int kthAncestor(Node root, int k, int node) {

        solve(root, k, node);

        return ans;
    }
}