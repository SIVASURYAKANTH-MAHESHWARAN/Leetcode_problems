class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        int len=pos.length;
        Map<Integer,Float>map=new HashMap<>();
        for(int i=0;i<len;i++){
            float tim=((float)target-pos[i])/speed[i];
            map.put(pos[i],tim);
        }
        Arrays.sort(pos);
        Stack<Float>stk=new Stack<>();
        for(int i=len-1;i>=0;i--){
            float time=map.get(pos[i]);
            if(stk.isEmpty()||time>stk.peek()){
                stk.push(time);
            }
        }
        return stk.size();
    }
}