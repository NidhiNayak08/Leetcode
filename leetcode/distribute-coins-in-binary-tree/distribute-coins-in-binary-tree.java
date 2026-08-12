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

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode root){
        if(root == null)return 0;

        int left = dfs(root.left);
        int right = dfs(root.right);

        ans += Math.abs(left); //no. of coins left gives/takes = no. of moves
        ans += Math.abs(right);

        int balance = root.val + left + right - 1;

        return balance;
    }
}

//Each subtree satisfies itself first, then passes its surplus/deficit to its parent. Every coin crossing the parent-child edge costs one move.

//2 things : ans we calculate using how many coins needed/given by left and right of this subtree
//balance we calc by currcoins + left + right + 