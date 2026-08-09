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
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l,r)+1;
    }
    public boolean isBalance(TreeNode root) {
        if(root == null) return true;
        int k = maxDepth(root.left);
        int m = maxDepth(root.right);
        if(Math.abs(k-m) <= 1) return true;
        else return false;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        Boolean left = isBalanced(root.left);
        Boolean right = isBalanced(root.right);
        if(left == false) return false;
        if(right == false) return false;
        if(isBalance(root) == false) return false;
        return true;
    }
}