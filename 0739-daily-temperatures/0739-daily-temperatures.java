class Solution {
    class pair{
        int ind;
        int cnt;
        pair(int ind,int cnt){
            this.ind=ind;
            this.cnt=cnt;
        }
    }
    public int[] dailyTemperatures(int[] temp) {
        int len=temp.length;
        int[]arr=new int[len];
        int i=0;
        Stack<pair>stk=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();
        
        while(i<len){
            int cnt=1;
            while(!stk.isEmpty() && temp[stk.peek().ind]<temp[i]){
                pair p=stk.pop();
                map.put(p.ind,cnt);
                cnt+=p.cnt;
            }
            pair p=new pair(i,cnt);
            stk.push(p);
            i++;
        }
        while(!stk.isEmpty()){
            map.put(stk.pop().ind,0);
        }
        for(i=0;i<len;i++){
            arr[i]=map.get(i);
        }
        return arr;
    }
}