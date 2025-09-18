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
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public void comp(TreeNode root, Map<Integer, PriorityQueue<Pair>> map , int col, int row) {
        if (root != null) {
            map.computeIfAbsent(col, k -> new PriorityQueue<>(
                (a,b) -> a.first == b.first ? a.second - b.second : a.first - b.first
            ));
            map.get(col).add(new Pair(row, root.val));

            comp(root.left, map, col - 1, row + 1);
            comp(root.right, map, col + 1, row + 1);
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, PriorityQueue<Pair>> map = new TreeMap<>();
        comp(root, map, 0, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for(PriorityQueue<Pair> pq : map.values()){
            List<Integer> cols = new ArrayList<>();
            while(!pq.isEmpty()){
                cols.add(pq.poll().second);
            }
            ans.add(cols);
        }
        return ans;
    }
}