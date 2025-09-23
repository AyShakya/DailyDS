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
    static class Pair{
        TreeNode temp;
        int num;
        Pair(TreeNode temp, int num){
            this.temp = temp;
            this.num = num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair> dq = new ArrayDeque<>();
        if(root==null){
            return 0;
        }
        int ans = 0;
        dq.offer(new Pair(root,0));
        while(!dq.isEmpty()){
            int size = dq.size();
            int nmin = dq.peek().num;
            int first = 0, last = 0;
            for(int i=0;i<size;i++){
                int curr = dq.peek().num - nmin;
                TreeNode p = dq.peek().temp;
                dq.poll();
                if(i==0) first = curr;
                if(i==size-1) last = curr;
                if(p.left!=null) dq.offer(new Pair(p.left, 2*curr+1));
                if(p.right!=null) dq.offer(new Pair(p.right, 2*curr+2));
            }
            ans = Math.max(ans, last-first+1);
        }
        return ans;
    }
}