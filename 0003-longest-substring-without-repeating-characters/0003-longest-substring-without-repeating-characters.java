class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        int low=0;
        int high=0;
        int ans=1;
        while(high<s.length()){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.get(s.charAt(high))==2){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                low++;
            }
            ans=Math.max(high-low+1,ans);
            high++;
        }
        return ans;
    }
}