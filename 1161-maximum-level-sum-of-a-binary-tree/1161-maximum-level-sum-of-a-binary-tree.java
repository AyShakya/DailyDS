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
    public int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int ans = 0, level = 0;

        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.offer(root);

        while(!dq.isEmpty()){
            level++;
            int curr = 0;
            for(int i = dq.size(); i>0; i--){
                TreeNode node = dq.poll();
                curr+=node.val;

                if(node.left!=null){
                    dq.offer(node.left);
                }
                if(node.right!=null){
                    dq.offer(node.right);
                }
            }
            if(maxSum<curr){
                maxSum = curr;
                ans = level;
            }
        }
        return ans;
    }
}