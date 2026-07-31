class Solution {
    long mod=1000000007;
    public int countTexts(String pressedKeys) {
        int n=pressedKeys.length();
        int i=0;
        long ans=1;
        while(i<n){
            char ch=pressedKeys.charAt(i);
            int len=0;
            while(i<n && ch==pressedKeys.charAt(i)){
                len++;
                i++;
            }
            long cnt=countWays(len,ch)%mod;
            // System.out.print(cnt);
            ans=(ans*cnt)%mod;
            // i++;
        }
        return (int)(ans%mod);
    }
    public long countWays(int n,char ch){
        long[]dp=new long[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]=dp[i-1];
            if(i>=2){
                dp[i]+=dp[i-2];
            }
            if(i>=3){
                dp[i]+=dp[i-3];
            }
            if(i>=4 && (ch=='7' || ch=='9')){
                dp[i]+=dp[i-4];
            }
            dp[i]=dp[i]%mod;
        } 
        return dp[n];
    }
}