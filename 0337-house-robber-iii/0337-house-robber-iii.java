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
    public int[] recurr(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int[]left=recurr(root.left);
        int[]right=recurr(root.right);
        int pick=root.val+left[1]+right[1];
        int not_pick=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{pick,not_pick};
    }
    public int rob(TreeNode root) {
        int[]ans=recurr(root);
        return Math.max(ans[0],ans[1]); 
    }
}