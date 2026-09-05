class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]>que=new LinkedList<>();
        int[]arr=new int[27];
        int len=tasks.length;
        for(int i=0;i<len;i++){
            arr[tasks[i]-'A']++;
        }
        for(int i=0;i<27;i++){
            if(arr[i]>0){
            pq.add(arr[i]);
            }
        }
        int time=0;
        while(!pq.isEmpty()||!que.isEmpty()){
            time++;
            if(!que.isEmpty() && que.peek()[1]==time){
                int[]a=que.poll();
                pq.add(a[0]);
            }
            if(!pq.isEmpty() ){
                int num=pq.poll()-1;
                int times=time+n+1;
                if(num>0){
                que.offer(new int[]{num,times});
                }
            }
        }
        return time;
    }
}