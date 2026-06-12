class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int[]freq=new int[26];
        int left=0;
        int max=0;
        int dist=0;
        HashMap<String,Integer>map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            if(++freq[s.charAt(right)-'a']==1){
                dist++;
            }
            while(dist>maxLetters || right-left+1>minSize){
                if(--freq[s.charAt(left)-'a']==0){
                    dist--;
                }
                left++;
            }
            if(right-left+1==minSize){
                String str=s.substring(left,right+1);
                map.put(str,map.getOrDefault(str,0)+1);
                int cnt=map.get(str);
                max=Math.max(max,cnt);
            }
        }
        return max;
    }
}