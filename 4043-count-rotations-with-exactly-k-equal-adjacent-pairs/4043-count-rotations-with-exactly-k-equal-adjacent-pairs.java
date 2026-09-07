class Solution {
    public int score(String s){
        int cnt=0;
        int n=s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
            }
        }
        return cnt;
    }
    public int countRotations(String s, int k) {
        int cnt=0;
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        for(int i=0;i<n;i++){
            
            if(i>=1){
            char ch=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            
            }
            int r=score(sb.toString());
            if(r==k){
                cnt++;
            }
            // System.out.println(sb);
            

        }
        return cnt;
    }
}