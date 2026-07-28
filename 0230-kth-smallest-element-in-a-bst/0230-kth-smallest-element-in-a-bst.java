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
    int cnt=1;
    int res=0;
    public void recurr(TreeNode root,int k){
        if(root==null){
            return;
        }
        recurr(root.left,k);
        if(cnt==k){
            res=root.val;
        }
         cnt++;
         recurr(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        recurr(root,k);
        return res;
    }
}