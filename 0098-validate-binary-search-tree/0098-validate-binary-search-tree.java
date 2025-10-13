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
    public boolean valid(TreeNode root, long low, long high){
        if(root==null){
            return true;
        }
        else if((long)root.val<=low || (long)root.val>=high){
            return false;
        }
        else{
            return valid(root.left, low, (long)root.val) && valid(root.right, (long)root.val, high);
        }

    }
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}