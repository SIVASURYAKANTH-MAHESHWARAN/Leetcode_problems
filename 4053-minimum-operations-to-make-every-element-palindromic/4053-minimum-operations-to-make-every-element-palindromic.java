class Solution {
    public long generatepalin(long p,int len){
        String str=String.valueOf(p);
        int ind=0;
        if(len%2==0){
            ind=str.length()-1;
        }
        else{
            ind=str.length()-2;
        }
        for(int start=ind;start>=0;start--){
            str+=str.charAt(start);
        }
        // System.out.println(str);
        return Long.valueOf(str);
    }
    public long generatextreme(int p,int len,boolean parity){
        if(len<0){
            return -1;
        }
        int u=0;
        if(!parity){
            if(p%2==0){
                u=8;
            }
            else{
                u=9;
            }
        }
        else{
            if(p%2==0){
                u=2;
            }
            else{
                u=1;
            }
        }
        if(len==0){
            return u;
        }
        int[]dig=new int[len];
        for(int i=0;i<len;i++){
            dig[i]=(parity)?0:9;
        }
        
        // System.out.print(len);
        dig[0]=u;
        dig[len-1]=u;
        long num=0;
        for(int i=0;i<len;i++){
            num=num*10+dig[i];
        }
        // System.out.println(num);
        return num;
    }
    public long func(int n){
        long cnt=Integer.MAX_VALUE;
         String val=String.valueOf(n);
         int len=val.length();
         int half=(len+1)/2;
         String p1=val.substring(0,half);
         long pre=Long.valueOf(p1);
         long base=1;
         for(int i=0;i<half-1;i++){
            base*=10;
         }
         long ld=(pre)/base;
         int parity=n%2;
         for(int dig=1;dig<=9;dig++){
            if(dig%2!=parity){
                continue;
            }
            if(dig==ld){
                for(int i=-1;i<=1;i++){
                    long p=pre+i;
                    if(p<dig*base||p>dig*base+base-1){
                        continue;
                    }
                    cnt=Math.min(cnt,Math.abs(n-generatepalin(p,len)));
                }
            }
            else if(dig<ld){
                long p=base*dig+base-1;
                cnt=Math.min(cnt,Math.abs(n-generatepalin(p,len)));
            }
            else{
                long p=base*dig;
                cnt=Math.min(cnt,Math.abs(n-generatepalin(p,len)));
            }
        }
        long small=generatextreme(n,len-1,false);
      
            cnt=Math.min(cnt,Math.abs(n-small));
        
        long big=generatextreme(n,len+1,true);
        cnt=Math.min(cnt,Math.abs(n-big));
        // System.out.println(cnt);
        return cnt;
    }

    public long minOperations(int[] nums) {
        long cnt=0;
        for(int n:nums){
            cnt+=func(n)/2;
            // System.out.println(cnt);
        }
        return cnt;
    }
}