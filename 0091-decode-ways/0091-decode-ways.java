class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[]dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                char ch=s.charAt(i-1);
                if(ch=='0'){
                    dp[i]=0;
                }
                else{
                    dp[i]=1;
                }
            }
            else{
               char fir=s.charAt(i-2);
               char sec=s.charAt(i-1);
               StringBuilder num=new StringBuilder();
               num.append(fir);
               num.append(sec);
               String num1=String.valueOf(num);
               int val=Integer.valueOf(num1);
            //    System.out.println(val);
               if(val==0||((sec=='0' && fir!='0') && (sec!='0' && fir=='0'||(val>=27)))){
                dp[i]=0;
               }
               else if(sec=='0' && fir!='0'){
                dp[i]=dp[i-2];
               }
               else if(sec!='0' && fir=='0'||(val>=27)){
                dp[i]=dp[i-1];
               }
            //    else if(sec=='0' && fir=='0' ||(val>=27)){
            //     dp[i]=0;
            //    }
               else{
                dp[i]=dp[i-1]+dp[i-2];
               }
            }
        }
        return dp[n];
    }
}