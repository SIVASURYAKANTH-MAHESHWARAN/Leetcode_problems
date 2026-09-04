class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        int[]arr=new int[26];
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']=i;
        }
        List<Integer>lis=new ArrayList<>();
        int st=0;
        int en=0;
        for(int i=0;i<n;i++){
            en=Math.max(en,arr[s.charAt(i)-'a']);
            if(i==en){
                lis.add(en-st+1);
                st=i+1;
            }
        }
        return lis;
    }
}