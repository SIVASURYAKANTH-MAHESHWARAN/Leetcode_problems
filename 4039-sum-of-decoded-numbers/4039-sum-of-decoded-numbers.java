class Solution {
    long mod=1000000007L;
    public int pow(long x,long n){
        if(n==0){
            return 1;
        }
        long ans=x;
        long nums=1;
        while(n!=1){
        
            nums=(n%2!=0)?(ans*nums)%mod:nums;
            ans=(ans*ans)%mod;
            if(n%2!=0){
                n--;
            }
            n/=2;
        }
        return (int)((nums%mod)*(ans%mod)%mod);
    }
    public long length(long num){
        long l=0;
        while(num!=0){
            l++;
            num/=10;
        }
        return l;
    }
    public long fun(long num){
        long w=num%10;
        num=(long)Math.floor(num/10);
        long len=length(num);
        System.out.println(len);
        
        long x=num/(int)pow(10,(len-w));
        long y=num%(int)pow(10,(len-w));
        System.out.println(pow(x,y)%mod);
        System.out.println(w+" "+num+" "+x+" "+y);
        return (pow(x,y)%mod);
    }
    public int sumDecoded(long[] nums) {
        long ans=0;
        for(long num:nums){
            ans=(ans+fun(num))%mod;
            System.out.print(ans);
        }
        return (int)ans;
    }
}