class Solution {
    public int balancedStringSplit(String s) {
        int cnt=0;
        int n=s.length();
        int ind=0;
        n--;
        int r=0;
        int l=0;
        while(ind<=n){
            if(s.charAt(ind)=='R'){
                r++;
            }
            if(s.charAt(ind)=='L'){
                l++;
            }
            if(r==l && r!=0){
                cnt++;
                r=0;
                l=0;
            }
            ind++;

        }
        return cnt;
    }
}