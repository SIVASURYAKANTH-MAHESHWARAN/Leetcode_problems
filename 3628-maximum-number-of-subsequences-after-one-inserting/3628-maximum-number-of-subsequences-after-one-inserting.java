class Solution {
    public long numOfSubsequences(String s) {
        int n=s.length();
        long l=0;
        long lc=0;
        long lct=0;
        long[]prel=new long[n+1];
        long[]prelc=new long[n+1];
        long[]suft=new long[n+1];
        long[]sufct=new long[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                l++;
            }
            if(s.charAt(i)=='C'){
                lc+=l;
            }
            if(s.charAt(i)=='T'){
                lct+=lc;
            }
            prel[i+1]=l;
            prelc[i+1]=lc;
        }
        long t=0;
        long ct=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='T'){
                t++;
            }
            if(s.charAt(i)=='C'){
                ct+=t;
            }
            suft[i+1]=t;
            sufct[i+1]=ct;
        }
    long ans1=lct+sufct[1];
    long ansc=0;
    for(int i=0;i<n;i++){
        ansc=Math.max(ansc,lct+prel[i+1]*suft[i+1]);
    }
    long anst=lct+prelc[n];
    long ans=Math.max(Math.max(ans1,ansc),anst);
    return ans;
    }
}