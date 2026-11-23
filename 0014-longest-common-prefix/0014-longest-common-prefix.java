class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            int len=strs[i].length();
            if(sb.length()>len){
                sb.delete(len,sb.length());
            }
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)!=strs[i].charAt(j)){
                    sb.delete(j,sb.length());
                    break;
                }
            }
        }
        return sb.toString();
    }
}