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

    public void comp(TreeNode root, Map<Integer, List<Pair>> map, int col, int row) {
        if (root != null) {
            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(new Pair(row, root.val));

            comp(root.left, map, col - 1, row + 1);
            comp(root.right, map, col + 1, row + 1);
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<Pair>> map = new HashMap<>();
        comp(root, map, 0, 0);
        List<Integer> sorted = new ArrayList<>(map.keySet());
        Collections.sort(sorted);
        List<List<Integer>> ans = new ArrayList<>();
        for (int key : sorted) {
            List<Integer> res = new ArrayList<>();
            List<Pair> list = map.get(key);
            list.sort((a, b) -> {
                if (a.first!=(b.first)) {
                    return a.first - b.first;
                }
                return a.second - b.second;
            });
            for (Pair p : list) {
                res.add(p.second);
            }
            ans.add(res);
        }
        return ans;
    }
}