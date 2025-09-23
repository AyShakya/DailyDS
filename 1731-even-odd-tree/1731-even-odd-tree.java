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
    public boolean isEvenOddTree(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        if(root == null){
            return true;
        }
        dq.offer(root);
        int level = 0;
        while(!dq.isEmpty()){
            int size = dq.size();
            Integer[] row = new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode temp = dq.poll();
                row[i] = temp.val;
                if(level%2==0){
                    if((row[i]%2==0) || (i!=0 && row[i-1]>=row[i])){
                        return false;
                    }
                }
                else{
                    if((row[i]%2!=0) || (i!=0 && row[i-1]<=row[i])){
                        return false;
                    }
                }
                if(temp.left!=null){
                    dq.offer(temp.left);
                }
                if(temp.right!=null){
                    dq.offer(temp.right);
                }
            }
            level++;
        }
        return true;
    }
}