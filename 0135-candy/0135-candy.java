class Solution {
    public int candy(int[] ratings) {
        int size=ratings.length;
        int[]arr=new int[size];
        Arrays.fill(arr,1);
        for(int i=0;i<size-1;i++){
            if(ratings[i]<ratings[i+1]){
                arr[i+1]=arr[i]+1;
            }
        }
        for(int i=size-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                
                arr[i-1]=Math.max(arr[i-1],arr[i]+1);
                
            }
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        return sum;
    }
}