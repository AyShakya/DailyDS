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
    public void markParent(TreeNode root, Map<TreeNode, TreeNode> map){
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.offer(root);
        while(!dq.isEmpty()){
            TreeNode temp = dq.poll();
            if(temp.left!=null){
                map.put(temp.left, temp);
                dq.offer(temp.left);
            }
            if(temp.right!=null){
                map.put(temp.right, temp);
                dq.offer(temp.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> par = new HashMap<>();
        markParent(root, par);
        Deque<TreeNode> dq = new ArrayDeque<>();
        Map<TreeNode, Boolean> visited = new HashMap<>();
        dq.offer(target);
        visited.put(target, true);
        int level = 0;
        while(!dq.isEmpty()){
            int size = dq.size();
            if(level==k) break;
            level++;
            for(int i=0;i<size;i++){
                TreeNode temp = dq.poll();
                if(temp.left!=null && visited.get(temp.left) == null){
                    dq.offer(temp.left);
                    visited.put(temp.left, true);
                }
                if(temp.right!=null && visited.get(temp.right) == null){
                    dq.offer(temp.right);
                    visited.put(temp.right, true);
                }
                if(par.get(temp)!=null && visited.get(par.get(temp)) == null){
                    dq.offer(par.get(temp));
                    visited.put(par.get(temp), true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!dq.isEmpty()){
            ans.add(dq.poll().val);
        } 
        return ans;
    }
}