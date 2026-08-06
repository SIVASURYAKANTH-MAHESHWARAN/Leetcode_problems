class Solution {
    public long pow(long a,long b){
        long ans=1;
        while(b>0){
            if(b%2==1){
                ans=(ans*a)%1000000007;
            }
            a=(a*a)%1000000007;
            b/=2;
        }
        return ans;
    }
    public long mmi(long num){
        return pow(num,1000000005);
    }
    public long comb(int n,int r){
        long[]fact=new long[n+1];
        fact[0]=1;
        // if(n>1){
        // fact[1]=1;
        // }
        for(int i=1;i<=n;i++){
            fact[i]=(fact[i-1]*i)%1000000007;
        }
        System.out.println(n+" "+r);
        return (fact[n]*mmi((fact[n-r]*fact[r])%1000000007))%1000000007;
    }
    public int countValidSequences(int n, int k) {
        long total=comb(n-1,k-1);
        long odd=(n-k)%2==0?comb(((n+k)/2)-1,k-1):0;
        return (int)(total-odd+1000000007)%1000000007;
    }
}