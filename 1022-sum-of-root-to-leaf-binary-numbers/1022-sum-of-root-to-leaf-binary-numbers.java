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
    public int f(TreeNode r, String s, int sum){
        if(r==null){
            return 0;
        }
        if(r.left==null && r.right==null){
            s = s + String.valueOf(r.val);
            sum+= Integer.parseInt(s, 2);
            return sum;
        }
        s = s+String.valueOf(r.val);
        int a = f(r.left, s, sum);
        int b = f(r.right, s, sum);
        return sum + a + b;
    }
    public int sumRootToLeaf(TreeNode root) {
        return f(root, "", 0);
    }
}