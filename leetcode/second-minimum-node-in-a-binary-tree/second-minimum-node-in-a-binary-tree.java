class Solution {

    int ans = -1;

    public int findSecondMinimumValue(TreeNode root) {
        dfs(root, root.val);
        return ans;
    }

    public void dfs(TreeNode root, int min) {
        if (root == null) return;

        if (root.val > min) {
            if (ans == -1) {
                ans = root.val;
            } else {
                ans = Math.min(ans, root.val);
            }
        }

        dfs(root.left, min);
        dfs(root.right, min);
    }
}