class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>lis=new ArrayList<>();
        int[]cha=new int[27];
        for(int i=0;i<s.length();i++){
            cha[s.charAt(i)-'a']=i;
        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            end=Math.max(end,cha[s.charAt(i)-'a']);
            if(i==end){
                int req=end-start+1;
                start=i+1;
                lis.add(req);
            }
        }
        return lis;
    }
}