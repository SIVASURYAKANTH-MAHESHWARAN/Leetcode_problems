class Solution {
    public int characterReplacement(String s, int k) {
        int[]freq=new int[26];
        int len=s.length();
        int left=0;
        int ans=0;
        for(int right=0;right<len;right++){
            freq[s.charAt(right)-'A']++;
            int mf=0;
            for(int i=0;i<26;i++){
                mf=Math.max(freq[i],mf);
            }
            while((right-left+1)-mf>k){
                freq[s.charAt(left)-'A']--;
                left++;
                mf=0;
                for(int i=0;i<26;i++){
                    mf=Math.max(mf,freq[i]);
                }
            }
            if((right-left+1)>ans){
                ans=right-left+1;
            }
        }
        return ans;
    }
}