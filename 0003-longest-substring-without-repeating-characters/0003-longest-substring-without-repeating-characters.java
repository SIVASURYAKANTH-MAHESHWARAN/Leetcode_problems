class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n=s.length();
        int l=0;
        Set<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(i));
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}