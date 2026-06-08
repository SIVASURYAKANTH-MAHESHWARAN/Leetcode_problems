class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ind1=0,len1=g.length;
        int ind2=0,len2=s.length;
        int cnt=0;
        if(len2==0){
            return 0;
        }
        while(ind1<len1 && ind2<len2){
            if(g[ind1]<=s[ind2]){
                cnt++;
                ind1++;
                ind2++;
            }
            else{
                ind2++;
            }
        }
        return cnt;
    }
}