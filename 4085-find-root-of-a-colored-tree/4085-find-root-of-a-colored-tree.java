class Solution {
    public int findColoredRoot(int[][] edges, String colors) {
        List<List<Integer>>lis=new ArrayList<>();
        int n=edges.length;
        for(int i=0;i<=n;i++){
            lis.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int x=edges[i][0];
            int y=edges[i][1];
            if(colors.charAt(x)=='R' && colors.charAt(y)=='B'){
                lis.get(x).add(y);
            }
            if(colors.charAt(x)=='B' && colors.charAt(y)=='R'){
                lis.get(y).add(x);
            }
            if(colors.charAt(x)=='B' && colors.charAt(y)=='W'){
                lis.get(x).add(y);
            }
            if(colors.charAt(x)=='W' && colors.charAt(y)=='B'){
                lis.get(y).add(x);
            }
            if(colors.charAt(x)=='W' && colors.charAt(y)=='R'){
                lis.get(x).add(y);
            }
            if(colors.charAt(x)=='R' && colors.charAt(y)=='W'){
                lis.get(y).add(x);
            }
        }
        int cnt=0;
        int[]ind=new int[n+1];
        int[]oud=new int[n+1];
        for(int i=0;i<=n;i++){
            for(int y:lis.get(i)){
                ind[y]++;
                oud[i]++;
            }
            // if(lis.get(i).size()>=1){
            //     oud[i]++;
            // }
        }
        int index=0;
        for(int i=0;i<=n;i++){
            if(oud[i]>=3){
                return -1;
            }
            if(ind[i]==0){
                cnt++;
                index=i;
            }
            // System.out.println(oud[i]);
        }
        return (cnt>1)?-1:index;
    }
}