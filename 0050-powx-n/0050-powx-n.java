class Solution {
    public double pow(double x,long n){
        n=Math.abs(n);
        double ans=x;
        double num=1;
        while(n!=1){
            num=(n%2!=0)?ans*num:num;
            ans*=ans;
            if(n%2!=0){
                --n;
            }
            n/=2;
                                     
        }
        return ans*num;
    }
    public double myPow(double x, int n) {
        // if(n<0){
        //     return pow(x,n*-1);
        // }
        // double ans=pow(x,n);
        if(n==0){
            return 1;
        }
        int sign=1;
        if(x<0){
            if(n%2==0){
                sign=1;
            }
            else{
                sign=-1;
            }
        }
        return (n<0)?1/pow(Math.abs(x),(n))*sign:pow(Math.abs(x),Math.abs(n))*sign;
    }
}