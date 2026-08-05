class Solution {
    public double myPow(double x, int n) {
        long pow=n;
        double ans=1;
        // if(x<0){
        //     if(x==Integer.MIN_VALUE){
        //         x=I
        //     }
        // }
        if(pow<0){
            // if(n==Integer.MIN_VALUE){
            //     n=Integer.MAX_VALUE;
            // }
            // else{
            //     n*=-1;
            // }
            x=1/x;
            pow*=-1;
        }
        while(pow>0){
            if((pow&1)==1){
                ans*=x;
            }
            x=x*x;
            pow>>=1;
        }
        // if(pow<0 && x<0){
        //     return ans*-1;
        // }
        // if(pow>0){
        //     return ans;
        // }
        // System.out.print(ans);
        // if(num<0){
        //     if(pow%2!=0){
        //         return (1/ans);
        //     }
        //     return 1/(ans*-1);
        // }
        return ans;
    }
}