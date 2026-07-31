class Solution {
    int mod=1000000007;
    public int countTexts(String pressedKeys) {
        int n=pressedKeys.length();
        long ans=1;
        int i=0;
        while(i<n){
            int len=0;
            char ch=pressedKeys.charAt(i);
            while(i<n && pressedKeys.charAt(i)==ch){
                len++;
                i++;
            }
            long cnt=countWays(len,ch);
            // System.out.print(cnt);
            ans=(ans*cnt)%mod;  
        }
        return (int)ans;
    }
    public long countWays(int len,char ch){
        long[]dp=new long[len+1];
        dp[0]=1;
        for(int i=1;i<=len;i++){
            dp[i]=dp[i-1];
            if(i>=2){
                dp[i]+=dp[i-2];
            }
            if(i>=3){
                dp[i]+=dp[i-3];
            }
            if((ch=='7'||ch=='9') && i>=4){
                dp[i]+=dp[i-4];
            }
            dp[i]%=mod;
        }
        return dp[len];
    }
}