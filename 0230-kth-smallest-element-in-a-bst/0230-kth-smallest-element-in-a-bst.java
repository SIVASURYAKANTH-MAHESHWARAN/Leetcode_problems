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
    public int recurr(TreeNode root,int k){
        //         if(root.left==null && root.right==null){
        //     if(cnt==k){
        //         res=root.val;
        //         // return root.val;
        //     }
        //     cnt++;
        //     return;
        // }
        if(root==null){
            return -1;
        }
        int left=recurr(root.left,k);
        // System.out.println(root.val);
              if(cnt==k){
            res=root.val;
        }
        cnt++;
         
        int right=recurr(root.right,k);
        // System.out.println(root.val);
       if(right!=-1){
        if(cnt==k){
            res=root.val;
        }
        cnt++;
       }
       
        // if(left==-1 && right==-1){
        //     if(cnt==k){
        //         res=root.val;
        //     }
        //     cnt++;
        // }
        return -1;
    }
    public int kthSmallest(TreeNode root, int k) {
        // if(root.left==null && root.right==null){
        //     return root.val;
        // }
        recurr(root,k);
        return res;
    }
}