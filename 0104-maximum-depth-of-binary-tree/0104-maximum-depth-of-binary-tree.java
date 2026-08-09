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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int size=0;
        Queue<TreeNode>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
             int len=que.size();
            if(len>0){
                size++;
            }
            // boolean flag=true;
            // if(node!=null){
            //     size++;
            // }
            // if(node.left!=null){
            // que.add(node.left);
            // }
            // if(node.right!=null){
            // que.add(node.right);
            // }
            for(int i=0;i<len;i++){
                TreeNode node=que.poll();
                // if(flag){
                //     size++;
                //     flag=false;
                // }
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
            }
            // size++;
        }
        return size;
    }
}