class Solution {
    public int countRotations(String s, int k) {
        int siz=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt((i+1)%n)){
                siz++;
            }
        }
        if(siz==k){
            return n-k;
        }
        if(siz-1==k){
            return siz;
        }
        return 0;
    }
}