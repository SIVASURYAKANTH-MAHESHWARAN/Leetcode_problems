class Solution {
    public long minDamage(int power, int[] damage, int[] health) {
        int n=damage.length;
    long[][]mat=new long[n][2];
        long pre=0;
        long freq=0;
        for(int i=0;i<n;i++){
                pre+=damage[i];
                // freq+=(health[i]%power==0)?health[i]/power:(health[i]/power)+1;
                // mat[i][0]=damage[i];
                // mat[i][1]=health[i];
        }
        // System.out.println(pre+" "+freq);
        for(int i=0;i<n;i++){
            long cyc=(health[i]%power==0)?health[i]/power:(health[i]/power)+1;
            // long dam=pre*cyc+(pre-damage[i])*(freq-cyc);
            // pre-=damage[i];
            // freq-=cyc;
            mat[i][0]=cyc;
            mat[i][1]=i;
            // long f=freq-cyc;
            // System.out.println(dam+" "+f);
        }
        Arrays.sort(mat,(a,b)->{
        int x=(int)a[1];
        int y=(int)b[1];

        return Long.compare(a[0]*damage[y],b[0]*damage[x]);
    });
        long ans=0;
        for(int i=0;i<n;i++){
            // long cyc=(health[(int)mat[i][1]]%power==0)?health[(int)mat[i][1]]/power:(health[(int)mat[i][1]]/power)+1;
            long cyc=mat[i][0];
            ans+=(pre*cyc);
            pre-=damage[(int)mat[i][1]];
            // System.out.println(ans+" "+mat[i][1]+mat[i][0]+" "+cyc); 
            // System.out.println(mat[i][1]); 
        }
        return ans;
    }
}