class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        List<int[]>lis=new ArrayList<>();
        int cnt=0;
        for(int arr[]:intervals){
            if(!lis.isEmpty()){
                for(int []a:lis){
                    int beg=a[0];
                    int end=a[1];
                    boolean flag=false;
                    for(int i=arr[0];i<=arr[1];i++){
                        if(beg<=i && end>=i){
                            flag=true;
                            break;
                        }
                    }
                    if(flag){
                        cnt++;
                    }
                }
            }
                lis.add(arr);
        }
        return cnt;
    }
}