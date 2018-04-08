/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        pruneTreeHelper(root);
        
        return root;
    }
    
    public int pruneTreeHelper(TreeNode root){
        if(root==null)
            return 0;
        
        if(pruneTreeHelper(root.left)==0)
            root.left = null;
        
        if(pruneTreeHelper(root.right)==0)
            root.right = null;
        
        return root.val + pruneTreeHelper(root.left) + pruneTreeHelper(root.right);
    }
}