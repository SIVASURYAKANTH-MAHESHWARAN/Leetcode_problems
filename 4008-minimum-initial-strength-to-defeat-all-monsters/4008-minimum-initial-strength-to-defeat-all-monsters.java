class Solution {
    public boolean valid(long power,int[]mon,long[]bon){
        int len=mon.length;
        for(int i=0;i<len;i++){
            long bonus=(i<bon.length)?bon[i]:0;
            long tem=power+bonus;
            // System.out.println(tem);
            if(tem<mon[i]){
                // System.out.println(tem+" "+mon[i]+" "+bonus+" "+power);
                return false;
            }
            power-=mon[i];
            if(power<0){
                power=0;
            }
        }

        return true;
    }
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int mind=0;
        for(int[]arr:boosts){
            mind=Math.max(mind,arr[1]);
        }
        long[]arr=new long[mind+2];
        for(int[]a:boosts){
            arr[a[0]]+=a[2];
            arr[a[1]+1]-=a[2];
        }
        for(int i=1;i<mind+2;i++){
            arr[i]+=arr[i-1];
        }
        // for(int num:arr){
        //     System.out.println(num);
        // }
        long h=0;
        for(int num:monsters){
            h+=num;
        }
        // System.out.println(h);
        long l=0;
        long ans=0;
        while(l<=h){
            long mid=(l+h)/2;
            // System.out.println(mid);
            if(valid(mid,monsters,arr)){
                ans=mid;
                h=mid-1;
            }
            else{
                // System.out.println(mid);
                l=mid+1;
            }
        }
        return ans;
    }
}