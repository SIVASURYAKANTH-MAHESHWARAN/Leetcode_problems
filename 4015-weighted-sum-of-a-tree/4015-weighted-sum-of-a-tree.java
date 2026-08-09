class Solution {
    class Node{
        int data;
        List<Node>lis;
        Node(int data){
            this.data=data;
            lis=new ArrayList<>();
        }
    }
    public long func(Node root){
        int cnt=0;
        Queue<Node>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int len=que.size();
            if(len>0){
                cnt++;
            }
           
            for(int i=0;i<len;i++){
                Node node=que.poll();
                // System.out.print(node.data+" ");
                for(Node nodes:node.lis){
                    que.add(nodes);
                }
                // System.out.println();
            }

        }
        return cnt;
    }
    public long func1(Node root,int[]nums,long height){
        long ans=0;
        int cnt=0;
        Queue<Node>que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int len=que.size();
            cnt++;
            for(int i=0;i<len;i++){
                Node node=que.poll();
                ans+=(nums[node.data]*(height-cnt+1));
                for(Node nodes:node.lis){
                    que.add(nodes);
                }
                // cnt++;
            }
           
        }
        return ans;
    }
    public long weightedSum(int[] parent, int[] nums) {
        int n=parent.length;
        Node[]node=new Node[n];
        for(int i=0;i<n;i++){
            node[i]=new Node(i);
        }
        for(int i=1;i<n;i++){
            node[parent[i]].lis.add(node[i]);
        }
        Node root=node[0];
        long h=func(root);
        long ans=func1(root,nums,h);
        return ans;
    }
}