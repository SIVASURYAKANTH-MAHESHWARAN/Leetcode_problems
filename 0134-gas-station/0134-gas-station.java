class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
          int n=gas.length;
        int tcost=0;
        int tgas=0;
        for(int i=0;i<n;i++){
            tcost+=gas[i];
            tgas+=cost[i];
        }
        if(tcost<tgas){
            return -1;
        }
        // for(int i=0;i<n;i++){
        //     int g=gas[i];
        //     boolean flag=true;
        //     for(int j=i;j<=i+n;j++){
        //         if(i==j){
        //             if(g<cost[i]){
        //                 flag=false;
        //                 break;
        //             }
        //         }
        //         else{
        //             if(g-cost[(j-1)%n]<0){
        //                 flag=false;
        //                 break;
        //             }
        //             g+=gas[j%n]-cost[(j-1)%n];
        //         }
        //         // else{
        //         // ggas[j%n]-cost[(j-1)%n];
        //         // System.out.print(g);
        //         // }
        //         // if(g<0){
        //         //     break;
        //         // }
        //     }
        //     if(flag){
        //     return i;
        //     }
        // }
        // int tcos=0;
        tgas=gas[0];
        int ans=0;
        for(int i=0;i<n;i++){
            int g=(i==0)?0:gas[i];
            int c=(i==0)?0:cost[i-1];
            int rem=tgas-c;
            if(rem<0){
                tgas=0;
                c=0;
                ans=i;
            }
            tgas+=g-c;
            // System.out.println(tgas);
        }
        return ans;
    }
}