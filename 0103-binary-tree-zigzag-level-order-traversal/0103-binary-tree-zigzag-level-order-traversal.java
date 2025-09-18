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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> dq = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        dq.offer(root);
        Boolean flag = true;
        while(!dq.isEmpty()){
            int size = dq.size();
            Integer[] row = new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode temp = dq.poll();
                int index = flag ? i : size-i-1;
                row[index] = temp.val;
                if(temp.left!=null){
                    dq.offer(temp.left);
                }
                if(temp.right!=null){
                    dq.offer(temp.right);
                }
            }
            ans.add(Arrays.asList(row));
            flag = !flag;
        }
        return ans;
    }
}