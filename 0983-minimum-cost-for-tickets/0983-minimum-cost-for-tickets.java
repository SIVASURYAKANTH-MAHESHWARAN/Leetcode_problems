class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int total_days=days[days.length-1];
        int[]dp=new int[days[days.length-1]+1];
        int ind=0;
        dp[0]=0;
        for(int i=1;i<=total_days;i++){
            if(days[ind]!=i){
                dp[i]=dp[i-1];
            }
            else{
                    int sum1=i-1>=0?dp[i-1]+costs[0]:costs[0];
                    int sum2=i-7>=0?dp[i-7]+costs[1]:costs[1];
                    int sum3=i-30>=0?dp[i-30]+costs[2]:costs[2];
                    dp[i]=Math.min(sum1,Math.min(sum2,sum3));
                    ind++;   
            }
        }
        return dp[total_days];
    }
}