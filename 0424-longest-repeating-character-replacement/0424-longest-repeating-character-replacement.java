class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int ans=0;
        int[]arr=new int[27];
        int n=s.length();
        int mf=0;
        for(int right=0;right<n;right++){
            arr[s.charAt(right)-'A']++;
            mf=Math.max(mf,arr[s.charAt(right)-'A']);
            int wlen=right-left+1;
            int res=wlen-mf;
            if(res>k){
                arr[s.charAt(left)-'A']--;
                left++;
            }
            if(res<=k){
                ans=Math.max(ans,wlen);
            }
        }
        return ans;
    }
}