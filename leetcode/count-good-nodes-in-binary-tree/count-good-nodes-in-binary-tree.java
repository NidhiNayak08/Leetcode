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

    int ans = 0;

    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return ans;
    }

    public void dfs(TreeNode node, int maxNode){
        if(node == null)return;

        if(node.val >= maxNode){
            ans++;
            maxNode = node.val;
        }

        dfs(node.left, maxNode);
        dfs(node.right, maxNode);

    }
}

//can track max node in each path. if curr node is max => its good node