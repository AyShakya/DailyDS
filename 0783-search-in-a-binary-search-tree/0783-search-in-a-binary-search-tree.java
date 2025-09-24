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
    public TreeNode searchBST(TreeNode root, int value) {
        if(root==null){
            return null;
        }
        if(root.val == value){
            return root;
        }
        else{
            if(root.val > value){
                return searchBST(root.left, value);
            }
            else{
                return searchBST(root.right, value);
            }
        }
    }
}