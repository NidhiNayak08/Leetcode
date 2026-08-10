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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        TreeNode xparent = null;
        TreeNode yparent = null;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0 ; i<size; i++){
                TreeNode node = q.poll();

                if(node.left!=null){
                    if(node.left.val == x)xparent = node;
                    if(node.left.val == y)yparent = node;
                    q.add(node.left);
                }

                if(node.right!=null){
                    if(node.right.val == x)xparent = node;
                    if(node.right.val == y)yparent = node;
                    q.add(node.right);
                }
            }

            if(xparent!=null && yparent!=null){
                return xparent!=yparent;
            }

            if(xparent!=null || yparent!=null){
                return false;
            }
        }
        return false;
    }
}