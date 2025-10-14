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
    public TreeNode insertIntoBST(TreeNode root, int value) {
        TreeNode node = new TreeNode(value);
        if(root == null){
            return node;
        }
        TreeNode temp = root;
        TreeNode q = null;
        while(temp!=null){
            q=temp;
            if(temp.val > value){
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
        }
        if(q.val > value){
            q.left = node;
        }
        else{
            q.right = node;
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1;i<n;i++){
            root = insertIntoBST(root, preorder[i]);
        }
        return root;
    }
}