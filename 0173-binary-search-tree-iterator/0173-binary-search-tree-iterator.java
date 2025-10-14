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
class BSTIterator {

    Deque<TreeNode> stack = new ArrayDeque<>();
    public BSTIterator(TreeNode root) {
        TreeNode temp = root;
        while(temp!=null){
            stack.push(temp);
            temp=temp.left;
        }
    }
    
    public int next() {
        TreeNode x = stack.poll();
        int y = x.val;
        if(x.right!=null){
            x=x.right;
            while(x!=null){
                stack.push(x);
                x=x.left;
            }
        }
        return y;
    }
    
    public boolean hasNext() {
        return stack.isEmpty()?false:true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */