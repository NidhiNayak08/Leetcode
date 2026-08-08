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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    public boolean dfs(TreeNode node, int curr, int target){
        
        if(node == null) return false;
        
        curr += node.val;

        //bc : leaf : check target
        if(node.left == null && node.right == null){
            if(curr == target) return true;
        }

        return dfs(node.left, curr, target) || dfs(node.right, curr, target);
    }
}