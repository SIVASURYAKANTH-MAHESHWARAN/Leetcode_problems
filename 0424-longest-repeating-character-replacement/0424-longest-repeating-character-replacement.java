class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int n=s.length();
        int[]maxfreq=new int[27];
        int mf=0;
        int ans=0;
        for(int right=0;right<n;right++){
            maxfreq[s.charAt(right)-'A']++;
            mf=Math.max(mf,maxfreq[s.charAt(right)-'A']);
            int wlen=right-left+1;
            int rem=wlen-mf;
            if(rem>k){
                maxfreq[s.charAt(left)-'A']--;
                left++;
            }
            if(rem<=k){
                ans=Math.max(ans,right-left+1);
            }
        }
        return ans;
    }
}