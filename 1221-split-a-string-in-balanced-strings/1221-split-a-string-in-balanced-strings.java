class Solution {
    public int balancedStringSplit(String str) {
        int cnt=0;
        int n=str.length();
        int[]pre=new int[n+1];
        Arrays.fill(pre,1);
        int ptr=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='L'){
                ptr++;
                pre[i]=ptr;
            }
            else{
                ptr--;
                pre[i]=ptr;
            }
            if(ptr==0){
                cnt++;
            }
        }
        return cnt;
    }
}