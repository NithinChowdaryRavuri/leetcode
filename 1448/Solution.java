/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    private int count = 0;

    private void dfs(TreeNode root, int maxVal) {
        if (root == null)
            return;
        if (root.val >= maxVal)
            count += 1;
        maxVal = Math.max(maxVal, root.val);
        dfs(root.left, maxVal);
        dfs(root.right, maxVal);
        return;
    }

    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }
}