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
    public int max1=Integer.MIN_VALUE;
    public int func(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=func(root.left);
        int right=func(root.right);
        max1=Math.max(max1,left+right);
        return Math.max(left,right)+1;
        }
    public int diameterOfBinaryTree(TreeNode root) {
        func(root);
        return max1;
    }
}