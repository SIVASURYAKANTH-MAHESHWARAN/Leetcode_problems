class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0;
        int curr=0;
        int ind=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            int g=gas[i]-cost[i];
            tgas+=g;
            curr+=g;
            if(curr<0){
                ind=i+1;
                curr=0;
            }
        }
        if(tgas<0){
            return -1;
        }
        return ind;
    }
}