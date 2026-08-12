/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        Queue<Node>que=new LinkedList<>();
        int cnt=0;
        que.add(root);
        while(!que.isEmpty()){
            int size=que.size();
            if(size>0){
                cnt++;
            }
            for(int i=0;i<size;i++){
                Node node=que.poll();
                for(Node nodes:node.children){
                    que.add(nodes);
                }
                // if(node.left!=null){
                //     que.add(node.left);
                // }
                // if(node.right!=null){
                //     que.add(node.right);
                // }
            }
        }
        return cnt;
    }
}