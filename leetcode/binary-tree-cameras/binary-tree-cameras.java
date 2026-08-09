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
    
    int minCam = 0;

    public int minCameraCover(TreeNode root) {

        if (dfs(root)==0) minCam++;
        return minCam;

    }

    public int dfs(TreeNode root){

        if(root == null){
            return 1;
        }

        if(root.left == null && root.right == null){
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if(left == 0 || right ==0){
            minCam++;
            return 2; //I need to have cam // greedy - parent puts camera 
        }

        if(left == 2 || right ==2){
            return 1; //I am covered (parent is covered)
        }

        return 0; //kids are covered, i need cam
    }
}

//3 states : 
//0: uncov, needs cam
//1 : cov
//2 : cov, has cam