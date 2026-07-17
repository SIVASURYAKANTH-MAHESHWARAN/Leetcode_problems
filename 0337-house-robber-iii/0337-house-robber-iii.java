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
    public int[] rob1(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int[]left=rob1(root.left);
        int[]right=rob1(root.right);
        int take=root.val+left[1]+right[1];
        int not_take=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{take,not_take};
    }
    public int rob(TreeNode root) {
        int[]ans=rob1(root);
        return Math.max(ans[0],ans[1]);
    }
}