class Solution {
    public int findJudge(int n, int[][] trust) {
        int[]arr1=new int[n];
        int[]arr2=new int[n];
        for(int i=0;i<trust.length;i++){
            arr1[trust[i][0]-1]++;
            arr2[trust[i][1]-1]++;
        }
        for(int i=0;i<n;i++){
            if(arr2[i]==n-1 && arr1[i]==0){
                return i+1;
            }
        }
        return -1;
    }
}