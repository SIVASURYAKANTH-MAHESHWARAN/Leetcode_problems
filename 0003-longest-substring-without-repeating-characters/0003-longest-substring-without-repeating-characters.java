class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int max=0;
        int low=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(low));
                    low++;
                }
                set.add(s.charAt(i));
            }
            else{
                set.add(s.charAt(i));
                System.out.println(i+" "+low+" "+1);
                max=Math.max(max,i-low+1);
            }
        }
        return max;
    }
}