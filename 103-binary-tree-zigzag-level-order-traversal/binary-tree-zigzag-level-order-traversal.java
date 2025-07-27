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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>result=new LinkedList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer>sublist=new LinkedList<>();
            while(size>0){
                TreeNode node=queue.poll();
                if(level%2!=0){
                    sublist.addFirst(node.val);
                }else{
                    sublist.add(node.val);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
            }
            level++;
            result.add(sublist);
        }
        return result;
    }
}