class Solution {
    public double myFunc(double x,int n){
        double pow=1;
        n=(n%2==0)?n:n--;
        // double pow=
        while(n>1){    
            if(n%2!=0){
            // num=x*x;
             pow*=x;
                n--;
            }   
            n/=2;
             x*=x;
            //  System.out.println(num+" "+n+" "+x);
        }
        return pow*x;
    }
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        if(n<0){
            int sign=1;
            if(n==Integer.MIN_VALUE){
                n=Integer.MAX_VALUE;
                if(x<0){
                sign=-1;
                }
            }
            else{
                n*=-1;
            }
            return sign*(1.0/myFunc(x,n));
        }
        return myFunc(x,n);
        // System.out.println("yes");
        // return n<0?:;
    }
}