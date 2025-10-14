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
    private static class BSTIterator {
        private Deque<TreeNode> stack = new ArrayDeque<>();
        private boolean forward;
        BSTIterator(TreeNode root, boolean forward) {
            this.forward = forward;
            pushAll(root);
        }
        private void pushAll(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = forward ? node.left : node.right;
            }
        }
        boolean hasNext() {
            return !stack.isEmpty();
        }
        int next() {
            TreeNode node = stack.pop();
            int val = node.val;
            if (forward) {
                pushAll(node.right);
            } else {
                pushAll(node.left);
            }
            return val;
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        BSTIterator leftIt = new BSTIterator(root, true);   
        BSTIterator rightIt = new BSTIterator(root, false); 
        if (!leftIt.hasNext() || !rightIt.hasNext()) return false;
        int i = leftIt.next();
        int j = rightIt.next();
        while (i < j) {
            int sum = i + j;
            if (sum == k) return true;
            if (sum < k) {
                if (leftIt.hasNext()) i = leftIt.next();
                else break;
            } else {
                if (rightIt.hasNext()) j = rightIt.next();
                else break;
            }
        }
        return false;
    }
}