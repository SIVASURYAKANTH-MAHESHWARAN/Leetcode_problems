class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tc=0;
        int cc=0;
        int n=gas.length;
        int ind=0;
        for(int i=0;i<n;i++){
            tc+=gas[i]-cost[i];
            cc+=gas[i]-cost[i];
            if(cc<0){
                ind=i+1;
                cc=0;
            }
        }
        if(tc<0){
            return -1;
        }
        return ind;
    }
}