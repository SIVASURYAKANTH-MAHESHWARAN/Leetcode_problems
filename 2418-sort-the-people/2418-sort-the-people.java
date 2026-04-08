class Solution {
    class pair{
        String str;
        int val;
        pair(String str,int val){
            this.str=str;
            this.val=val;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        List<pair>lis=new ArrayList<>();
        int n=names.length;
        for(int i=0;i<n;i++){
            lis.add(new pair(names[i],heights[i]));
        }
        Collections.sort(lis,(a,b)->b.val-a.val);
        String[]res=new String[n];
        for(int i=0;i<n;i++){
            res[i]=lis.get(i).str;
        }
        return res;
    }
}