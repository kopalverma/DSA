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
    // int idx = -1;
    
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null) return null;
        // r1 = root;
        TreeNode r1 = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(r1);
        return root;
    }
}