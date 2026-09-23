class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {

        // Tree empty or key not found
        if (root == null) {
            return null;
        }

        // Key is in right subtree
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }

        // Key is in left subtree
        else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }

        // Key found
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 3: Only left child
            if (root.right == null) {
                return root.left;
            }

            // Case 4: Two children
            TreeNode IS = findInorderSuccessor(root.right);

            root.val = IS.val;

            root.right = deleteNode(root.right, IS.val);
        }

        return root;
    }

    public static TreeNode findInorderSuccessor(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}