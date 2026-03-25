class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int i=0;
         int left=0;
          int cnt=0;
        Set<Character>set=new HashSet<>();
        while(i<len){
            char ch=s.charAt(i);      
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                
                left++;
            }
            set.add(ch);
            cnt=Math.max(cnt,i-left+1);
            i++;
        }
        return cnt;
    }
}